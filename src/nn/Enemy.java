
package nn;

public abstract class Enemy{
    
    private int health;
    private String typeAttack;
    private int rangeAttack;
    // velocity
    
    public Enemy(){
    
    }
    
    /*
    public void movement(){
        
    }
    */
    
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(String typeAttack) {
        this.typeAttack = typeAttack;
    }

    public int getRangeAttack() {
        return rangeAttack;
    }

    public void setRangeAttack(int rangeAttack) {
        this.rangeAttack = rangeAttack;
    }
    
    
    

}

