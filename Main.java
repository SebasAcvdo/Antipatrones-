import Veterinaria.Veterinaria;
import Veterinaria.Animal;
import Veterinaria.Perro;
public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        
        animales[0] = new Perro("Firulais", "Café", "Croquetas");
        animales[1] = new Perro("Max", "Negro", "Pollo");
        
        Veterinaria veterinaria = new Veterinaria("El perro Feliz", animales);

        // Optionally allow user to register animals interactively
        // veterinaria.ingresarAnimales();

        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}