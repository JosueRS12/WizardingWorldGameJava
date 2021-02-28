package keyMove;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener{

    private boolean[] key = new boolean[256];
    public static boolean UP, LEFT, RIGHT, DOWN;
    
    public KeyControl(){
        UP = false;
        LEFT = false;
        RIGHT = false;
        DOWN = false;
    }
    
    public void update(){
        UP = key[KeyEvent.VK_UP];
        DOWN = key[KeyEvent.VK_DOWN];
        RIGHT = key[KeyEvent.VK_RIGHT];
        LEFT = key[KeyEvent.VK_LEFT];                
    }
    

    @Override
    public void keyPressed(KeyEvent ke) {
        key[ke.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        key[ke.getKeyCode()] = false;
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
