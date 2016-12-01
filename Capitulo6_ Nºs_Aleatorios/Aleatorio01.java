/**
 *Escribe un programa que muestre la tirada de tres dados.
 *Se debe mostrar también la suma total (los puntos que suman
 *entre los tres dados).
 *
 * @author Antonio R.P.
 */
public class Aleatorio01 {
  public static void main(String[] args) {
    int tirada;
    int suma = 0;
    
    System.out.println("Se mostrará el resultado de la tirada de 3 dados" );
    for(int i = 0; i <3; i ++) {
      tirada = (int) (Math.random() * 6) + 1;
      System.out.println(tirada + " ");
      suma += tirada;
    }
     System.out.println("el resultado de la suma de las tiradas es : " + suma);
  }
}
