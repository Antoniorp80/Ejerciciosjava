/**
 *Realiza un programa que pida un número por teclado y que luego
 *muestre ese número al revés.
 * 
 * @author Antonio R.P.
 */
public class Bucles25 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero |(procure que tenga al menos más de dos elementos): ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
  }
}
