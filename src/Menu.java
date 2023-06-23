import java.util.Scanner;

public class Menu {

    public Menu(){

    }

    public char menuPrincipal(){
        char opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Circulo");
        System.out.println("4. Finalizar");
        opcion = scanner.next().charAt(0);
        return opcion;

    }

}
