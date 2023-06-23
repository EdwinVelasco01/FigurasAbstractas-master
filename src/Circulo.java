import java.util.Scanner;
public class Circulo extends Figura {

    double centroX, centroY;
    double puntoX, puntoY;
    double distanciaX, distanciY;

    double radio;

    public void ingresarCoordenadas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del centro del circulo: ");
        double centroX= sc.nextDouble();
        System.out.println("Ingrese la coordenada y del centro del circulo: ");
        double centroY= sc.nextDouble();
        /*
        System.out.println("Ingrese la coordenada x de un punto del circulo: ");
        double puntoX= sc.nextDouble();
        System.out.println("Ingrese la coordenada y de un punto del circulo: ");
        double puntoY= sc.nextDouble();

         */
        System.out.println("Ingrese el radio del circulo");
        double radio= sc.nextDouble();

    }

    /*
    public static double calcularRadio(double centroX, double centroY, double puntoX, double puntoY){
        double distanciaX= puntoX-centroX;
        double distanciaY= puntoY-centroY;
        return Math.sqrt(distanciaX*distanciaX+distanciaY*distanciaY);
    }

     */

    @Override
    public double calcularPerimetro() {
       //double radio = calcularRadio(centroX, centroY, puntoX, puntoY);
        double perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro es:"+perimetro);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        //double radio = calcularRadio(centroX, centroY, puntoX, puntoY);
        double area = Math.PI*radio;
        System.out.println("El area es:"+area);
        return area;
    }


}
