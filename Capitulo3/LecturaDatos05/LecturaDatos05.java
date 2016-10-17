/**
 *
 * Programa para calcular area de un rectángulo.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos05 {
  public static void main(String[] args) {
       System.out.println("Área de un triángulo");
    System.out.print("Por favor, introduzca valor de la base : ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inroduzca valor de la altura : ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (base * altura)/2);
  }
}
