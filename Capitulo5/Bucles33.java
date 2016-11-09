/**
 *Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores
 * 
 * @author Antonio R.P.
 */
public class Bucles33 {
  public static void main(String[] args) {
    System.out.println("Programa que pinta una U: ");
    System.out.print("Introduzca la altura por favor: ");
    int altura = Integer.parseInt(System.console().readLine());

    //Pinta la sección de los palos de la U
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    // Pinta la base de la U
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
