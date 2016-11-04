/**
 *Escribe un programa que muestre en tres columnas, el cuadrado y
 *el cubo de los 5 primeros números enteros a partir de uno que se
 *introduce por teclado.
 *
 * @author Antonio R.P.
 */
public class Bucles11 {
  public static void main(String[] args) {
    
    
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
