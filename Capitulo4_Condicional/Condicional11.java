/**
 *
 * Programa para calcular los segundos que faltan hasta media noche a partir de la hora introducida.
 *
 * @author Antonio R.P.
 */

public class  Condicional11 {
  public static void main(String[] args) {
    System.out.println("programa para decir los segundos que faltan hasta media noche");
    
    System.out.println("Por favor, introduzca la hora actual: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduzca los minutos actuales: ");
    int minutos = Integer.parseInt(System.console().readLine());
    

    int segundosActuales = (hora * 3600) + (minutos * 60);
    int segundosMedianoche = (24 * 3600) - (segundosActuales);

    System.out.printf(" Desde las %02d:%02d hasta la media noche faltan %d segundos\n",hora,minutos,segundosMedianoche);
  }
}
