/**
 * Escribe un programa que lea una lista de diez números y determine
 * cuántos son positivos, y cuántos son negativos.
 *
 * @author Antonio R.P.
 */
public class Bucles13 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca 10 números enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) > 0) {
        positivos++;
      } else {
        negativos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " números positivos y " + negativos + " negativos");

  }
}
