package bichos;

public class gato extends bichos {
    private boolean vaccinated;
    
    public void Set(boolean v){
        this.vaccinated = v;
    }
    
    public String GetVaccine(){        
        if(this.vaccinated) return "Vacinado";        
        return "Não vacinado";
    }
    
    public void Talk(){
        System.out.println("Miau, meu nome é "+ this.GetNome() + "!");
    }
}
