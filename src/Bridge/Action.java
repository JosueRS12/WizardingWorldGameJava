package Bridge;

public abstract class Action {
    private boolean state;

    public Action(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    public abstract void perform();
    
}
