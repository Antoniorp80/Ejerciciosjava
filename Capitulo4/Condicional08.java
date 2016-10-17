/**
 *
 * Programa para calcular la media de 3 notas
 *
 * @author Antonio R.P.
 */

public class  Condicional08 {
  public static void main(String[] args) {
      
    System.out.println("la media de sus 3 notas");
    System.out.println("Por favor, introduzca el valor de la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Ahora introduzca el valor de la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());

    System.out.println(" y por último introduzca el valor de la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    Double media = (nota1 + nota2 + nota3) / 3 ;

    System.out.printf("su nota media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
    }
    
    if (media >= 9) {
      System.out.print("Sobresaliente");
    }
  }
}
