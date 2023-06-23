import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        System.out.println("Programa");
        boolean opcionsalir = true;
        do {
            char opcion = menu.menuPrincipal();
            switch (opcion){
                case '3':
                    circulo.ingresarCoordenadas();
                    circulo.calcularPerimetro();
                    circulo.calcularArea();
                    break;
                case '2':
                    cuadrado.ingresarPuntos();
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    break;
                case '1':
                    triangulo.calcularArea();
                    triangulo.calcularPerimetro();
                default:
                    opcionsalir = false;
                    break;
            }

        }while (opcionsalir);

    }
}