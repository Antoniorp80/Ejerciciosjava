/**
 *
 * Programa conversor kb a Mb.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos11 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca el número de Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "kb son " +  (kb / 1024) + "Mb.");
  }
}
