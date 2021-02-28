package prototype;

import gameComponent.GameComponent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;


public class Potion extends GameComponent implements Cloneable{
   private String typePotion;
   
   public Potion(BufferedImage texture, Vector2D position, String typePotion){
       super(texture, position);       
       this.typePotion = typePotion;
   }
   
   
   public Object Clone() throws CloneNotSupportedException{
     return super.clone();
   }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
   
   
   
}
