/**
 *Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
 *nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 *El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 *se incluye en el cómputo.
 * 
 * @author Antonio R.P.
 */
public class Bucles21 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca números enteros: ");
    System.out.print("Para finalizar introduca un número negativo: ");
    
    int numeroIntroducido;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        numeroDeElementos++;
        if ((numeroIntroducido % 2) == 1) { // aquí nos mira los número impares
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
        } else { // números pares
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha introducido " + numeroDeElementos + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
  }
}
