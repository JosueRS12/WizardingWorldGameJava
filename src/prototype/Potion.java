package prototype;


public class Potion implements Cloneable{
   private String typePotion, effect;
   
   public Potion(String typePotion, String effect){
       this.effect = effect;
       this.typePotion = typePotion;
   }
   
   
   public Object Clone() throws CloneNotSupportedException{
     return super.clone();
   }
   
   
   
}
