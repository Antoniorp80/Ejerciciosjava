/**
 *Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 *programa debe pedir la altura. Se debe comprobar que la altura sea un número
 *impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 *error.
 * 
 * @author Antonio R.P.
 */
public class Bucles38 {
  public static void main(String[] args) {
    System.out.println("Programa que pint un reloj: ");
    System.out.print("Por favor, introduzca la altura del reloj siendo un número impar: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // Pinta la parte de arriba ////////
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea superior del reloj//
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print("*");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } // while parte de arriba ///////////////////////
      
      // pint la parte de abajo /////////////////////////////////////
      espaciosInternos = 0;
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print("*");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } // while parte de abajo ///////////////////////      
    }
  }
}
