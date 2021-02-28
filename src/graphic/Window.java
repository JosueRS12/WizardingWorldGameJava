package graphic;


import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import keyMove.KeyControl;
import state.GameState;


public class Window extends JFrame implements Runnable{
    
    public static final int WIDTH = 800, HEIGHT= 600;
    private Canvas canvas;
    private static Window w;
    private Thread thread;
    private boolean running;
    private BufferStrategy bs;
    private Graphics g;
    
    private final int FPS = 60;
    private double TARGETTIME = 1000000000/FPS;
    private double delta =0;
    private int AVERAGEFPS = FPS;

    
    private KeyControl keyControl;
    private GameState gameState;
    //
   
    
    public Window(){        
        setTitle("WizardingWorld");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Canvas
        keyControl = new KeyControl();
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);        
        add(canvas);
        canvas.addKeyListener(keyControl);
        setVisible(true);
       
    }
    
    public static Window getWindow(){ //Singleton
        if(w == null){
            return w = new Window();
        } else{
            return w;
        }
    }

    private void init(){
        Assets.init();
        gameState = new GameState();
    }
    
    
    public void update(){
       keyControl.update();
       gameState.update();
    }
    
    public void draw(){
        bs = canvas.getBufferStrategy();
        if(bs == null){
            canvas.createBufferStrategy(3);
            return;
        }        
        g = bs.getDrawGraphics();        
        //
        
        
        g.setColor(Color.BLACK);
        
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        
        gameState.draw(g);
        
        
        //g.drawString(""+AVERAGEFPS, 100, 100);
        //
        g.dispose();
        bs.show();
    }
    
    
    @Override
    public void run() {
        
         
        long now = 0;
        long lastTime = System.nanoTime();
        int frames = 0;
        long time = 0;
        init();
        
        while(running){
            now = System.nanoTime();
            delta += (now - lastTime)/TARGETTIME;
            time += (now - lastTime);
            lastTime = now;
            
            if(delta >= 1)
            {
                update();
                draw(); 
                delta --;
                frames ++;                
            }
            if(time >= 1000000000)
            {
                AVERAGEFPS = frames;
                frames = 0;
                time = 0;
            }
        }
        
        stop();
    }
    
    public void start(){
        thread = new Thread(this);
        thread.start();
        this.running = true;
    }
    
    public void stop(){
        try{
            thread.join();
        } 
        catch(InterruptedException e){
            e.printStackTrace();
        }        
    }

}
