/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra el máximo, el mínimo y la media de esos números.
 *
 * @author Antonio R.P.
 */
public class Aleatorio05 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 50 números aleatorios entre 100 y 199: ");
    int minimo = 100;
    int maximo = 199;
    int n;
    int suma = 0;
    
    for ( int i = 0; i < 50; i ++) {
      n = (int)(Math.random()*100)+ 100; //es *100 para intervalo [0,100) y +100 para desplazarlo al 100 //
      System.out.print(n + " ");
      
      suma += n; // hace la suma de todos los n//
      
      if (n < minimo) { //genera el mínimo//
        minimo = n;
      }
      
      if (n > maximo) { //genera el máximo//
        maximo = n;
      }
    }
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50); // esto es lo mismo que hacer varios print//
    //la media se saca con suma/50//
  }
}
