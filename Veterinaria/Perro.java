package Veterinaria;

public class Perro extends Animal {
    
    public Perro(String nombre, String colorPelaje, String comidaFavorita) {
        super(nombre, colorPelaje, comidaFavorita);
    }

    @Override
    public void registrarAnimal(java.util.Scanner scanner) {
        System.out.println("ingrese el nombre del perro:");
        nombre = scanner.nextLine();
        System.out.println("ingrese el color del pelaje:");
        colorPelaje = scanner.nextLine();
        System.out.println("ingrese la comida favorita:");
        comidaFavorita = scanner.nextLine();
    }
    @Override
    public void tratarAnimal() {
        switch (padecimiento) {
            case GRIPE:
                System.out.println("Tratando la gripe del perro con medicamentos y reposo.");
                break;
            case FRACTURA:
                System.out.println("Tratando la fractura del perro con inmovilización y cirugía si es necesario.");
                break;
            case INFECCION:
                System.out.println("Tratando la infección del perro con antibióticos.");
                break;
            default:
                System.out.println("Tratando el padecimiento del perro de manera general.");
                break;
        }
        this.padecimiento = null;
        System.out.println("se ha tratado al animal");
    }

}
