
/**
 * Ejercicios variables06 Factura con base imponible almacenada
 *
 * @author Antonio RP
 */

public class Variables06 {
  public static void main(String[] args) {

    double baseImponible = 22.75;
    double iva = 3.31;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total con iva  %8.2f\n", (baseImponible + iva));
  }
}
