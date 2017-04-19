package bichos;

public class bichos {
    
    private String name;
    private double weight;
    
    public void Set(String name){
        this.name = name;
    }
    public void Set(double weight){
        this.weight = weight;
    }
    
    public void Talk(){
        System.out.println("Eu sou o animal " + this.name);
    }
    
    public String GetNome(){
        return this.name;
    }
}
