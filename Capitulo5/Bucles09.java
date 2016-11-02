/**
 *Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * @author Antonio R.P.
 */
public class Bucles09 {
  public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero para mostrarle cuántos dígitos contiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
