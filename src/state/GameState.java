package state;

import gameComponent.MovingObject;
import graphic.Assets;
import java.awt.Graphics;
import java.util.ArrayList;
import math.Vector2D;
import observer.Enemy;
import observer.Key;
import observer.Player;
import observer.Snooper;
import prototype.Potion;

public class GameState {
    
    private Player player;
    private Key key;
    private Potion potion;
    private Enemy enemyFire, enemyIce;    
    private ArrayList<Potion> pt = new ArrayList<>();
    private ArrayList<MovingObject> mvo = new ArrayList<MovingObject>();
    
    public GameState(){
        player = new Player(Assets.player, new Vector2D(20,20), new Vector2D(2,2),"Wingardium", 2, this);
        key = new Key(Assets.key, new Vector2D(700,500),true);
        enemyFire = new Enemy(Assets.enemyFire, new Vector2D(100,400),new Vector2D(1,1) ,2, "crucio", 3, this);
        enemyIce = new Enemy(Assets.enemyIce, new Vector2D(300,222),new Vector2D(1,1) ,2, "patronus", 3, this);
        potion = new Potion(Assets.health, new Vector2D(400, 500), "health");                        

    }
    
    public void update(){        
        player.update();
        enemyFire.update();
        enemyIce.update();
        
        player.addSnooper(enemyFire);
        player.addSnooper(enemyIce);
            
     
        //player.update(); 
        
    }

    public ArrayList<MovingObject> getMvo() {
        return mvo;
    }
    
    
    public Boolean state(){
        if(player.getPosition().getX() == 700 && player.getPosition().getY() == 500){
            return true;            
        } 
        else{
            return false;
        }                    
        
    }
    
    
    public void draw(Graphics g) throws CloneNotSupportedException{
        player.draw(g);
        enemyFire.draw(g);
        enemyIce.draw(g);
        //movingObject
        for(int i = 0; i < mvo.size(); i++)
            mvo.get(i).draw(g);
        
        //
        key.draw(g);
        
        for(int i = 0; i<3; i++){
            pt.add((Potion) potion.Clone());
        }
        for(Potion ptn : pt){
            ptn.draw(g);   
        }
        if(key.isState()==true)
            key.draw(g);
        //enemyFire.draw(g);
        //enemyIce.draw(g);
    }


}
