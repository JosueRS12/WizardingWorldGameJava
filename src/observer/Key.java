package observer;

import gameComponent.GameComponent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

public class Key extends GameComponent{
    boolean state;

    public Key(BufferedImage texture, Vector2D position, boolean state) {
        super(texture, position);
        this.state = state;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
 

    


}
