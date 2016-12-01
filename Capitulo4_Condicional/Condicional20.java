/**
 *
 *Programa que te muestra si el nº introducido por teclado con un máximo de 5 cifras es capicúa.
 *
 * @author Antonio R.P.
 */
public class Condicional20 {

  public static void main(String[] args) {

    int n;
    boolean capicua = false;
    System.out.print("Este programa nos muestra si un nº es capicúa");
    System.out.print("Por favor, introduzca un número entero que no excedade 5 cifras): ");
    n = Integer.parseInt(System.console().readLine());
    
    
    // a partir de aquí cada if hace los de 1,2,3,4 y por último 5 cifras//
    if (n < 10) {
      capicua = true;
    }
    
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("Este número es capicúa.");
    } else {
      System.out.println("Este número no es capicúa.");
    }
  }
}
