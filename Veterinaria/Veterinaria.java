package Veterinaria;

public class Veterinaria {
    String nombre;
    Animal[] animals;

    public Veterinaria (String nombre, Animal[] animals ){
        this.nombre = nombre;
        this.animals = animals;
    }

    public void ingresarAnimales(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            for(Animal animal : animals){
                animal.registrarAnimal(scanner);
            }
        } finally {
            
        }
    }
    public void mostrarAnimales(){
        for(Animal animal : animals){
            animal.mostrarInfoBasica();
        }
    }
    public void tratarAnimales(){
        for(Animal animal : animals){
            animal.tratarAnimal();
        }
    }
}
