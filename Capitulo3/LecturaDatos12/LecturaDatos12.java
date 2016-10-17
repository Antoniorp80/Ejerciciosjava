/**
 *
 * Programa para calcular segunda nota para sacar media deseada.
 *
 * @author Antonio R.P.
 */

public class LecturaDatos12 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca valor de la primera nota : ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inroduzca valor de la nota final deseada : ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    System.out.println("el valor de la segunda nota debe ser " + ((notaFinal - (nota1*04)/0.6));
  }
}
