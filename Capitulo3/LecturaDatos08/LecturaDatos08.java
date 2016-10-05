/**
 *
 * Programa para calcular las horas trabajadas a X precio hora.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos08 {
  public static void main(String[] args) {
    int precioHora = 12;
    System.out.println("Precio por hora = " + precioHora + "euros");
    
    System.out.print("Por favor, introduzca las horas trabajadas ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());

    System.out.printf("horas trabajadas %8.2f\n", horasTrabajadas);
    System.out.printf("precio por hora  %8.2f\n", (float)precioHora);
    System.out.printf("----------------------\n");
    System.out.printf("Total          %8.2f\n", (horasTrabajadas * precioHora));
  }
}
