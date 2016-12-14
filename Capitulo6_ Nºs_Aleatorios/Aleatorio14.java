/**
 * 
 *    Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 *    adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 *    programa dirá cuántas oportunidades quedan y si el número introducido es menor o 
 *    mayor que el que ha pensado.
 *
 * @author Antonio Rodríguez Padilla
 */
public class Aleatorio14 {
  public static void main(String[] args) {
    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Piensa un número del 0 al 100. Tienes 5 intentos.");
    System.out.println("Pulsa la tecla INTRO para pasar al siguiente.");
    System.console().readLine();

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
      mayorMenorOIgual = Integer.parseInt(System.console().readLine());
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("¡ EN horabuena ha acertado!");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("¡ha fallado!, mejor suerte la próxima vez.");
    }
  }
}
