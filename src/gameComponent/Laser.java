package gameComponent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

public class Laser extends MovingObject{

    public Laser(BufferedImage texture, Vector2D position, Vector2D velocity, double angle) {
        super(texture, position, velocity);
        this.angle = angle;
        this.velocity = velocity;
    }

    @Override
    public void update() {
        position.add(velocity);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
}
