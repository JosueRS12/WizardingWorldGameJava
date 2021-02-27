package observer;

import java.util.ArrayList;

public class Attractive {
    private ArrayList<Snooper> observer = new ArrayList<>();  
    
    public void addSnooper(Snooper snp){
        observer.add(snp);
    }
    
    public void deleteSnooper(Snooper snp){
        observer.add(snp);
    }
    
    public void notify(){
        for(Snooper sn: observer){
            sn.performAction(this);
        }
    }

}
