/**
 *
 *Programa que nos muestra si un número introducido por teclado es par y divisible entre 5.
 *
 * @author Antonio R.P.
 */

public class  Condicional14 {
  public static void main(String[] args) {

    
    System.out.println("Por favor introduzca un número entero");
    int n = Integer.parseInt(System.console().readLine());
    
    if ((n % 2) == 0) {
      System.out.println("El número introducido es par");
    } else {
      System.out.println("El número introducido es impar");
    }
    if ((n % 5) == 0) {
      System.out.println("y es divisible entre 5");
    } else {
      System.out.println("y no es divisible entre 5");
    }
  }
}
