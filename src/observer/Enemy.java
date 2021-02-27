package observer;

public class Enemy {
    private int health;
    private String typeSpell;
    private int rangeAttack;

    public Enemy(int health, String typeSpell, int rangeAttack) {
        this.health = health;
        this.typeSpell = typeSpell;
        this.rangeAttack = rangeAttack;
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
    
    
    
    
}
