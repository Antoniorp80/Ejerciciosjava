/**
 *Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 *separados por espacios.
 *
 * @author Antonio R.P.
 */
public class Aleatorio04 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 20 números aleatorios entre 0 y 10: ");

    for ( int i = 0; i < 20; i ++) {
      System.out.print((int)(Math.random()*11)+ " "); //es *11 porque se incluye el 0 y el 10//
    }
    System.out.println();
  }
}
