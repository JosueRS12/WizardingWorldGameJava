package Bridge;

public class Attack extends Action{
    
    private int coolDown;
    public Attack(boolean state, int coolDown) {        
        super(state);
        this.coolDown = coolDown;
    }

    @Override
    public void perform() {
        //....
    }
    
    
    
}
