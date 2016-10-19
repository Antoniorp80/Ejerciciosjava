/**
 *
 *Programa que ordena tres números enteros introducidos por teclado
 *
 * @author Antonio R.P.
 */

public class  Condicional13 {
  public static void main(String[] args) {
    int aux;
    System.out.println("Programa que ordena tres números enteros introducidos por teclado.");
    
    System.out.println("Por favor, introduzca los números enteros y pulse intro:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());

// esto siguiente ordena el primero con el segundo, el segundo con el tercero y primero con el segundo.//
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
