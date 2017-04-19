package animals;

import bichos.bichos;
import bichos.cachorro;
import bichos.gato;

public class Animals {
    public static void main(String[] args) {
        bichos bicho = new bichos();
        
        bicho.Set("Floppy");
        bicho.Set(1.0);
        
        bicho.Talk();
        
        cachorro dog = new cachorro();
        
        dog.Set(true);
        
        
        System.out.println("Eu sou um cachorro: " + dog.GetBehaviour());
        
        
    }
    
}
