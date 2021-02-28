package gameComponent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

public abstract class GameComponent {
    protected BufferedImage texture;
    protected Vector2D position;
    
    public GameComponent(BufferedImage texture, Vector2D position) {
        this.texture = texture;
        this.position = position;
    }
    
    public abstract void update();
    public abstract void draw(Graphics g);

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }
    
    
    
    
}
