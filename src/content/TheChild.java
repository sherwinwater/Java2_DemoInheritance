package content;

public class TheChild extends TheParent{

    String name;
    public TheChild(String n){
    this.name = n;
    }
    
    public TheChild(){
        
    }
    
    public String printChild(){
        return "This is print child";
    }
}
