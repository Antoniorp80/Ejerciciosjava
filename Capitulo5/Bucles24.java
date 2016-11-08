/**
 *Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
 *en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 * @author Antonio R.P.
 */
public class Bucles24 {
  public static void main(String[] args) {
    System.out.println("Programa que pinta una pirámide hecha con caractéres numéricos.");
    System.out.print("Por favor, introduzca la altura de la pirámide:");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // introduce los espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // introduce la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      
      System.out.println();
    }
  }
}
