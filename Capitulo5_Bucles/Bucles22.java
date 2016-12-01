/**
 *Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Antonio R.P.
 */
public class Bucles22 {
  public static void main(String[] args) {

    
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido " + numeroDeElementos + " números en total.");
    System.out.println("su suma es " + suma + ".");
    System.out.println("La media de los elementos introducidos es " + suma / numeroDeElementos + ".");
  }
}

