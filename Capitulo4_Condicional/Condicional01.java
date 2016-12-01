/**
 *
 * Programa para decir qué toca a primera hora cada día de la semana introducido.
 *
 * @author Antonio R.P.
 */

public class Condicional01 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca día de la semana: ");
    String dia = (System.console().readLine().toLowerCase());
    
    if (dia.equals ("lunes")) {
      System.out.print("a primera hora toca S.I");
    } else if (dia.equals ("martes")) {
      System.out.print("a primera hora toca Prog");
    } else if (dia.equals ("miércoles")) {
      System.out.print("a primera hora toca Prog");
    } else if (dia.equals ("jueves")) {
      System.out.print("a primera hora toca B.D.");
    } else if (dia.equals ("viernes")) {
      System.out.print("a primera hora toca L.M.");
    } else {
      System.out.print("eso no es un día de la semana");
    }
      
      
  }
}
