/**
 * Ejercicios variables04 conversor € a pesetas
 *
 * @author Antonio RP
 */

public class Variables04 {
  public static void main(String[] args) {
    
    double euros = 10.00;
    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
