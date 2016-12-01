/**
 *Escribe un programa que calcule la media de un conjunto de números
 *positivos introducidos por teclado. A priori, el programa no sabe
 *cuántos números se introducirán. El usuario indicará que ha terminado
 *de introducir los datos cuando meta un número negativo.
 *
 * @author Antonio R.P.
 */
public class Bucles10 {
  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Calculadora de media.");
    System.out.println("Introduzca nºs enteros (introduzca un número negativo para salir):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
