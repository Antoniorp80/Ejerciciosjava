/**
 *
 *Programa que calcula la media de dos notas, si 
 * "a" es >=5 muestra la nota media.
 * "b" es <5 preguntará si en la recuperación somos apto o no apto, si somos apto mostrará un 5.
 * "c" es <5 preguntará si en la recuperación somos apto o no apto, si no somos apto mostrará la nota media.
 * @author Antonio R.P.
 */
public class Condicional21 {
  public static void main(String[] args) {

    System.out.println("Parte de notas");
    System.out.print("por favor, introduzca nota 1: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("por favor, introduzca nota 2: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿En su examen de recuperación ha sido? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.println("Tu media es de " + media);
  }
}

