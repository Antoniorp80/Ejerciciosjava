/**
 *
 * Programa para calcular volumen de un cono.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos09 {
  public static void main(String[] args) {

    System.out.println("volumen de un cono en cm");
    System.out.print("Por favor, introduzca valor del radio en cm: ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inroduzca valor de la altura : ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.printf("El volumen del cono es %.2f %s", ((1.0 / 3.0) * Math.PI * radio^2 * altura), "cm^3");
  }
}
