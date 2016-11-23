/**
 *Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 *adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 *programa dirá cuántas oportunidades quedan y si el número introducido es menor o 
 *mayor que el que ha pensado.
 *
 * @author Antonio R.P.
 */
public class Aleatorio06 {
  public static void main(String[] args) {
    System.out.println("Adivina números: ");
    int oportunidades = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroMisterioso = (int) (Math.random() * 101);
    
    System.out.println("¿Qué número del 0 al 100 saldrá?. Tienes 5 oportunidades.");
    // descuenta número de oportunidades//
    do {
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      oportunidades --;
      //  estos if nos da error e indica si es mayor o menor que el número introducido//
      if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ) {
        System.out.println("El número en el que pienso es menor que " + numeroIntroducido);
        System.out.println("te quedan " + oportunidades + "intentos.");
      }
      
      if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ) {
        System.out.println("El número en el que pienso es mayor que " + numeroIntroducido);
        System.out.println("te quedan " + oportunidades + "intentos.");
      }
      // acierto//
      if ( (numeroIntroducido == numeroMisterioso) ) {
        acertado = true;
        System.out.println("¡¡Enhorabuena, has dado en el clavo!! ");
      }
    } while ( !acertado && (oportunidades > 0) ); //cierra el bucle//
    
    if (!acertado) {
      System.out.println("¡¡lo siento , no das una!! ");
    }
  }
}
