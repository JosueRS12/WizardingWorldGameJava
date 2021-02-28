package state;

import graphic.Assets;
import java.awt.Graphics;
import java.util.ArrayList;
import math.Vector2D;
import observer.Enemy;
import observer.Key;
import observer.Player;
import prototype.Potion;

public class GameState {
    
    private Player player;
    private Key key;
    private Potion potion;
    private Enemy enemy;
    private ArrayList<Potion> pt = new ArrayList<>();
    
    public GameState(){
        player = new Player(Assets.player, new Vector2D(20,20),"crucio", 2);
        key = new Key(null, new Vector2D(800,600),true);
        enemy = new Enemy(null, new Vector2D(0,0), 2, "wingardium", 3);
        potion = new Potion(null, new Vector2D(400,333), "health");
    }
    
    public void update(){
        player.update(); 
        
    }
    
    public void draw(Graphics g) throws CloneNotSupportedException{
        player.draw(g);
        key.draw(g);
        for(int i = 0; i<3; i++){
            pt.add((Potion) potion.Clone());
        }
        for(Potion ptn : pt){
            ptn.draw(g);   
        }            
        enemy.draw(g);
    }


}
