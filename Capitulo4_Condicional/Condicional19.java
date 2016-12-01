/**
 *
 *Programa que te muestra el nº de dígitos del número entero introducido por teclado con un máximo de 5 cifras.
 *
 * @author Antonio R.P.
 */
public class Condicional19 {

  public static void main(String[] args) {

    int n, digitos = 0;
    
    System.out.println("Programa que te dice el nº de dígitos del nº entero introducido por teclado.");
    System.out.println(" por favor introduzca un nº entero con un máximo de 5 cifras");
    
     n = Math.abs(Integer.parseInt(System.console().readLine()));

    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    
    if (( n >= 10000 ) && ( n <= 99999 )) {
      digitos = 5;
    }
    
    if ( n >99999 ) {
      System.out.println("el nº entero introducido supera los 5 dígitos, por favor, introduca uno de 5.");

    }
    
    System.out.println("el nº de dígitos es " + digitos);
  }
}
