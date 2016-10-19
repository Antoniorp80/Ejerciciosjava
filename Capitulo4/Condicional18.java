/**
 *
 *Programa que te muestra en pantalla el priemr número del número entero introducido por teclado con un máximo de 5 cifras.
 *
 * @author Antonio R.P.
 */
public class Condicional18 {

  public static void main(String[] args) {

    int n, primera = 0;
    
    System.out.println("Programa que te dice la última cifra del entero introducido por teclado.");
    System.out.println(" por favor introduzca un nº entero con un máximo de 5 cifras");
    
    n = Integer.parseInt(System.console().readLine());

    if ( n < 10 ) {
      primera = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primera = n / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera);
  }
}
