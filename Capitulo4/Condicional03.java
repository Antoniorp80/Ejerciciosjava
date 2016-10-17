/**
 *
 * Programa para decir qué toca a primera hora cada día de la semana introducido.
 *
 * @author Antonio R.P.
 */

public class Condicional03 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca día: ");
    int dia = Integer.parseInt(System.console().readLine().toLowerCase());
    
    switch(dia) {
      case 1:
        System.out.print("lunes");
        break;
      case 2:
        System.out.print ("martes");
        break;
      case 3:
        System.out.print ("miércoles");
        break;
      case 4:
        System.out.print ("jueves");
        break;
      case 5:
        System.out.print ("viernes");
        break;
      case 6:
        System.out.print ("sábado");
        break;
      case 7:
        System.out.print ("domingo");
        break;
      default:
        System.out.print("No has escrito un número de día de la semana");
      }
    }
}
    
      
