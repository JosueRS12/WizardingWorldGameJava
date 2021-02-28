package Bridge;

public abstract class Spell {    
    private int damage, range;
    private Action ac;

    public Spell(int damage, int range, Action ac) {        
        this.damage = damage;
        this.range = range;
        this.ac = ac;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Action getAc() {
        return ac;
    }

    public void setAc(Action ac) {
        this.ac = ac;
    }
    
    
    public abstract void effect();

}
