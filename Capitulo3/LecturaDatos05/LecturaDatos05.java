/**
 *
 * Programa para calcular area de un rectángulo.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos05 {
  public static void main(String[] args) {
       System.out.println("Área de un rectángulo");
    System.out.print("Por favor, introduzca valor de la base en cms: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inroduzca valor de la altura en cms: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es " + (base * altura) + "cm^2");
  }
}
