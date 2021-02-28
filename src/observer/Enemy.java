package observer;

import gameComponent.GameComponent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

public class Enemy extends GameComponent implements Snooper {
    private int health;
    private String typeSpell;
    private int rangeAttack;

    public Enemy(BufferedImage texture, Vector2D position, int health, String typeSpell, int rangeAttack) {
        super(texture, position);
        this.health = health;
        this.typeSpell = typeSpell;
        this.rangeAttack = rangeAttack;
    }
    
     @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getTypeSpell() {
        return typeSpell;
    }

    public void setTypeSpell(String typeSpell) {
        this.typeSpell = typeSpell;
    }

    public int getRangeAttack() {
        return rangeAttack;
    }

    public void setRangeAttack(int rangeAttack) {
        this.rangeAttack = rangeAttack;
    }
    
    /*
    get and set position
    */

    @Override
    public void performAction(Attractive a) {
        //change position y attack.
    }

   


    
    
    
    
}
