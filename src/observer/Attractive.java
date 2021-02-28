package observer;

public interface Attractive {
     
    public abstract void addSnooper(Snooper snp);
    
    public abstract void deleteSnooper(Snooper snp);
    
    public abstract void alert();

}
