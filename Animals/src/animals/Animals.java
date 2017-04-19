package animals;

import bichos.bichos;
import bichos.cachorro;
import bichos.gato;

public class Animals {
    public static void main(String[] args) {
        bichos bicho = new bichos();
        
        bicho.Set("Floppy");
        bicho.Set(2.0);
        
        bicho.Talk();
        
        cachorro dog = new cachorro();
        
        dog.Set(true);
        dog.Set("Snoppy");
        System.out.println("Eu sou um cachorro: " + dog.GetBehaviour());
        dog.Talk();
        
        gato cat = new gato();
        
        cat.Set(true);
        cat.Set("Flasky");
        cat.Set(1.0);
        
        cat.Talk();
        System.out.println("Eu sou um gato: " + cat.GetVaccine());
        
    }
    
}
