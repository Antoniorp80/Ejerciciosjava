/**
 *Escribe  un  programa que calcule el factorial |(si introducimos 5 es 1*2*3*4*5=120) de un  número
 *entero leído por teclado.
 * 
 * @author Antonio R.P.
 */
public class Bucles28 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    
    do {
      System.out.print("Introduzca un número entero mayor o igual que 0: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println("El factorial del " + numeroIntroducido + " es " + factorial);
    }
  }
}
