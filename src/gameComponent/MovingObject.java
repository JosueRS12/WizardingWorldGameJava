package gameComponent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

public abstract class MovingObject extends GameComponent{
    
    protected Vector2D velocity;
    protected double angle;
    
    
    public MovingObject(BufferedImage texture, Vector2D position, Vector2D velocity) {        
        super(texture, position);
        this.velocity = velocity;
        angle = 0;
    }
    
}
