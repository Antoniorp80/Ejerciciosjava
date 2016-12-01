/**
 *
 * Programa para resolver ecuación ax + b = 0
 *
 * @author Antonio R.P.
 */

public class  Condicional05 {
  public static void main(String[] args) {
      
    System.out.println("Para resolver la ecuación ax + b = 0");
    System.out.println("Por favor, introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Ahora introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Sin solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
