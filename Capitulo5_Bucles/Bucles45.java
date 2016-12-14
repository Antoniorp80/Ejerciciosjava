/**
 *Escribe un programa que cambie un dígito dentro de un número dando la
 *posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 *empezando por el 1. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos. Suponemos que el usuario introduce
 *correctamente los datos.
 * 
 * @author Antonio R.P.
 */
public class Bucles45{
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("introduza la posisición donde cambiar el dígito deseado: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.println("Introduzca el número por el que quiere cambiar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda con el dígito cambiado
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
    
    // parte derecha no se suma posisión
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));

    // resultado
    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion)) + parteDerecha;
    System.out.println("El número resultante es " + numero);
  }
}
