/**
 *
 *Programa que nos muestra cuántos minutos faltan hasta el fin de semana teniendo en cuenta que el fin de semana comienza a las 15:00 del viernes.
 * 
 * @author Antonio R.P.
 */
public class Condicional22 {
  public static void main(String[] args) {
    System.out.println("¿¿Cúantos minutos faltan para el finde??: ");
    System.out.println("Por favor, introduzca un día de la semana, no se incluyen sábado ni domingo: ");
    
    String dia = System.console().readLine();
    int diaSemana = 0;

    switch(dia) {
      case "lunes":
        diaSemana = 0;
        break;
      case "martes":
        diaSemana = 1;
        break;
      case "miércoles":
        diaSemana = 2;
        break;
      case "jueves":
        diaSemana = 3;
        break;
      case "viernes":
        diaSemana = 4;
        break;
      default:
        System.out.print("Introduzca un día de la semana válido.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaSemana * 24 * 60) + (horas * 60) + minutos;
    
    System.out.println("En " + (minutosTotales - minutosActuales) + " minutos será fin de semana YUPIIII!!!.");
  }
}


