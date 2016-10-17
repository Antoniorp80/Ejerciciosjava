/**
 *
 * Programa para calcular tiempo que tarda un objeto en caer desde una altura h.
 * t=
 *
 * @author Antonio R.P.
 */

public class  Condicional06 {
  final static double g = 9.81;
  public static void main(String[] args) {

    System.out.println("Calculo del tiempo que tarda en caer un objeto");
    System.out.println("Por favor, introduzca el valor de h: en metros ");
    Double h = Double.parseDouble(System.console().readLine());

    double t = Math.sqrt(2*h/g);

    System.out.printf("Tardará %.2f segundos en caer.\n", t);

  }
}

