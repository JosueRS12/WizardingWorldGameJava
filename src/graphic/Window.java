package graphic;


import javax.swing.JFrame;
import java.awt.Canvas;

public class Window extends JFrame{
    
    public static final int WIDTH = 800, HEIGHT= 600;
    
    public static Window w;
    
    public Window(){
        setTitle("WizardingWorld");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static Window getWindow(){ //Singleton
        if(w == null){
            return w = new Window();
        } else{
            return w;
        }
    }

}
