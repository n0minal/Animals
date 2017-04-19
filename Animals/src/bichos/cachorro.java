package bichos;

public class cachorro extends bichos {
    private boolean has_good_behaviour;
    
    public void Set(boolean b){
        this.has_good_behaviour = b;
    }
    
    public String GetBehaviour(){        
        if(this.has_good_behaviour) return "Manso";        
        return "Feroz";
    }
    
    public void Talk(){
        System.out.println("Au au, meu nome é "+ this.GetNome() + "!");
    }
}
