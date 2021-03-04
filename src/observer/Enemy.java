package observer;

import Bridge.Patronus;
import Bridge.Spell;
import gameComponent.GameComponent;
import gameComponent.Laser;
import gameComponent.MovingObject;
import graphic.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import math.Vector2D;
import state.GameState;

public class Enemy extends MovingObject implements Snooper {
    private int health;
    private String spell;
    private int rangeAttack;
    private GameState gameState;
    private Random r = new Random();


    public Enemy(BufferedImage texture, Vector2D position, Vector2D velocity, int health, String spell, int rangeAttack, GameState gameState) {        
        super(texture, position, velocity);
        this.health = health;
        this.spell = spell;
        this.rangeAttack = rangeAttack;
        this.gameState = gameState;
    }
    
    
    
    
     @Override
    public void update() {
        //bichos persiguien al player       
        if(spell.equals("patronus")){
            gameState.getMvo().add(new Laser(
                    Assets.blue,
                    position,
                    position,
                    0                                
            ));
        }
        if(spell.equals("crucio")){
            gameState.getMvo().add(new Laser(
                    Assets.green,
                    position,
                    position,
                    0                                
            ));
        }
        if(spell.equals("wingardium")){
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
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getTypeSpell() {
        return spell;
    }

    public void setTypeSpell(String typeSpell) {
        this.spell = typeSpell;
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
    public void performAction() {
        position.setX(r.nextInt(751));
        position.setY(r.nextInt(562));        
    }

   


    
    
    
    
}
