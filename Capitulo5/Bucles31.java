/**
 *Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 *programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 *mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Antonio R.P.
 */
public class Bucles31 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura deseada: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("*");
    }

  }
}
