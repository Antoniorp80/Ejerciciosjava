/**
 * 7.1 Arrays
 * 
 * 3. Escribe un programa que lea 10 números por teclado y que luego
 *    los muestre en orden inverso, es decir, el primero que se
 *    introduce es el último en mostrarse y viceversa.
 *
 * @author Antonio Rodríguez Padilla
 */
public class Array03 {

	public static void main(String[] args) {
    
    System.out.println("Por favor introduzca 10 números y pulse enter ");
    
    int[] num = new int[10];
    
    for (int i = 0; i< 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    
 
    
    //dibuja la tabla e introduce los valores//  

    System.out.println("\n┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");


    for (int j = 9; j>= 0; j--) {
      System.out.printf ("│%5d", num[j]);
    }
    System.out.println("│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("\n a los valores no asignados en el array automáticamente se les asigna el valor 0");
  }
}
