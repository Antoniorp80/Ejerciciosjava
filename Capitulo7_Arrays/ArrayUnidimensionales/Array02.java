/**
 * 7.1 Arrays
 * 
 * 2. Define un array de 10 simbolos con nombre “simbolo” y asigna
 *    valores a los elementos según la siguiente tabla:
 *    Posición  0   1   2   3   4   5   6   7   8   9
 *    Valor    'a' 'x'         '@'    '  ' '+' 'Q'
 *
 *    Muestra el contenido de todos los elementos del array. ¿Qué sucede
 *    con los valores de los elementos que no han sido inicializados?
 *
 * @author Antonio Rodríguez Padilla
 */
public class Array02 {

	public static void main(String[] args) {
    
    
    char[] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[6] = 'Q';
    
    //dibuja la tabla e introduce los valores//  

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│ %4c", simbolo[i]==0?' ':simbolo[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("│\n a los valores no asignados en el array automáticamente se le da un carácter vacío");
  }
}
