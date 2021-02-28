package observer;

import gameComponent.GameComponent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import keyMove.KeyControl;
import math.Vector2D;


public class Player extends GameComponent implements Attractive{
    private String typeSpell;
    private int health;
    private ArrayList<Snooper> snooper = new ArrayList<>();
    public Player(BufferedImage texture, Vector2D position, String typeSpell, int health) {
        super(texture, position);
        this.typeSpell = typeSpell;
        this.health = health;
    }

    @Override
    public void update() {
        
        if(KeyControl.RIGHT){
            if(position.getX()<750)
                position.setX(position.getX()+1);                    
        }                               
        if(KeyControl.LEFT){
            if(position.getX()>0)
                position.setX(position.getX()-1);                
        }            
        if(KeyControl.UP){
            if(position.getY()>0)
                position.setY(position.getY()-1);        
        }
            
        if(KeyControl.DOWN){
            if(position.getY()<537)
                position.setY(position.getY()+1);     
        }
            
        
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
    
    
    public String getTypeSpell() {
        return typeSpell;
    }

    public void setTypeSpell(String typeSpell) {
        this.typeSpell = typeSpell;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    //cambio de posición
    
    /*
    get and set position
    */
    
   
    
    //observer

    @Override
    public void addSnooper(Snooper snp) {
        snooper.add(snp);
    }

    @Override
    public void deleteSnooper(Snooper snp) {
        snooper.remove(snp);
    }

    @Override
    public void alert() {
        for(Snooper sn: snooper){
            sn.performAction(this);
        }
    }

    
   
    
    
    
    
    
    
    
            
}
