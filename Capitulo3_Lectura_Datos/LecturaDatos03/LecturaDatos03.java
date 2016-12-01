/**
 *
 * 3. Realiza un conversor de pesetas a euros.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos03 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de pesetas a convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double euros = pesetas / 166.386;

    System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
  }
}
