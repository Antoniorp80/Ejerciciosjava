/**
 *    Realiza el control de acceso a una caja fuerte. La combinación
 *    será un número de 4 cifras. El programa nos pedirá la combinación
 *    para abrirla. Si no acertamos, se nos mostrará el mensaje
 *    (Lo siento, ha agotado las 4 oportunidades) y si acertamos se nos dirá
 *    (La caja fuerte se ha abierto satisfactoriamente). Tendremos cuatro
 *    oportunidades para abrir la caja fuerte. Se acierta con la clave 8888.
 *
 * @author Antonio R.P.
 */
public class Bucles07 {
  public static void main(String[] args) {
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 8888) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("La caja se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
