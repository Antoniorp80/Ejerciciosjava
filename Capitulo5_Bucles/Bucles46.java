/**
 *Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 *asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 *que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 *contrario se debe mostrar un mensaje de error.
 * 
 * @author Antonio R.P.
 */
public class Bucles46{
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());

    if ((anchura < 2) || (altura < 2)) {

      System.out.println("Lo siento, los datos introducidos no son correctos,el valor al menos ha de ser 2 ");
      System.out.println("el valor de la altura y la anchura han de ser al menos de 2 ");

    } else {
    
      // Línea superior //
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      // Parte intermedia, pinta lados y espacios interiores //
      
      for (int i = 2; i < altura; i++) {
        System.out.print("\n*");
        for (int espacios = 2; espacios < anchura; espacios++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();

      // Línea inferior //
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      System.out.println("");
    } // else
  }
}
