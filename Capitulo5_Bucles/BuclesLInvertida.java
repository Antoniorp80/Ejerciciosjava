/**
 *Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 *programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 *mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Antonio R.P.
 */
public class BuclesLInvertida {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura deseada: ");
    int altura = Integer.parseInt(System.console().readLine());

   int j = 1;
   
   //pinta el palo vertical
   while (j < altura) {
    
    for (int contadorEspacios = 0; contadorEspacios < altura / 2; contadorEspacios++) {
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
    j++;
  }

  j = 1;
  int anchura = (altura / 2) + 1;
  while (j <= anchura) {
    System.out.print("*");
    j++;

  }
  System.out.println();
  }
}
