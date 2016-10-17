/**
 *
 * Programa para calcular volumen de un cono.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos09 {
  public static void main(String[] args) {

    System.out.println("volumen de un cono");
    System.out.print("Por favor, introduzca valor del radio : ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inroduzca valor de la altura : ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El volumen del cono es " + ((1/3)*Math.PI* radio^2*altura) + "cm3";
  }
}
