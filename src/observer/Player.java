package observer;

import gameComponent.GameComponent;
import gameComponent.Laser;
import gameComponent.MovingObject;
import graphic.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import keyMove.KeyControl;
import math.Vector2D;
import state.GameState;


public class Player extends MovingObject implements Attractive{
    private String typeSpell;
    private int health;
    private ArrayList<Snooper> snooper = new ArrayList<Snooper>();
    private Vector2D heading;       
    private GameState gameState;
    
    public Player(BufferedImage texture, Vector2D position, Vector2D velocity, String typeSpell, int health, GameState gameState) {
        super(texture, position, velocity);
        this.typeSpell = typeSpell;
        this.health = health;      
        this.gameState = gameState;
        
    }

    @Override
    public void update() {
        
        if(KeyControl.RIGHT){
            if(position.getX()<750){
                position.setX(position.getX()+1);    
                alert();
            }
                
        }                               
        if(KeyControl.LEFT){
            if(position.getX()>0){
                position.setX(position.getX()-1);
                alert();                
            }                
        }            
        if(KeyControl.UP){
            if(position.getY()>0){
                position.setY(position.getY()-1);        
                alert();
            }                
        }
            
        if(KeyControl.DOWN){
            if(position.getY()<537){
                position.setY(position.getY()+1);     
                alert();
            }                
        }
        
        if(KeyControl.SHOOT){
            gameState.getMvo().add(new Laser(
                    Assets.red,
                    position,
                    position,
                    0                                
            ));
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

    @Override
    public Vector2D getPosition() {
        return position;
    }
    
   
    
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
            sn.performAction();
        }
    }

    
   
    
    
    
    
    
    
    
            
}
