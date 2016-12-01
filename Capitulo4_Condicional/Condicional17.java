/**
 *
 *Programa que te muestra en pantalla el último número del número entero introducido por teclado.
 *
 * @author Antonio R.P.
 */
public class Condicional17 {

  public static void main(String[] args) {

    System.out.println("Programa que te dice la última cifra del entero introducido por teclado.");
    System.out.println(" por favor introduzca un nº entero");
    
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
  }
}
