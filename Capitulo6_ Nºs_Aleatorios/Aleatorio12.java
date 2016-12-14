/**
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
 *forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
 *suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Antonio Rodríguez Padilla
 */
public class Aleatorio12 {
  public static void main(String[] args) {
    int nota;
    int suspensos= 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for (int i = 0; i < 20; i++) {  
      nota = (int)(Math.random() * 5);//genera las 5 notas aleatorias//
      
      switch(nota) {
        case 0:
          System.out.print ("suspensos ");
          suspensos++;
          break;
    
        case 1:
          System.out.print ("suficientes ");
          suficientes++;
          break;
        
        case 2:
          System.out.print ("bienes ");
          bienes++;
          break;
        
        case 3:
          System.out.print ("notables ");
          notables++;
          break;
        
        case 4:
          System.out.print ("sobresalientes ");
          sobresalientes++;
          break;
        default:
      }
    }
    System.out.println("\nhay " + suspensos + "suspensos.");
    System.out.println( "hay " + suficientes + "suficientes.");
    System.out.println( "hay " + bienes + "bienes.");
    System.out.println( "hay " + notables + "notables.");
    System.out.println( "hay " + sobresalientes + "sobresalientes.");

  }
}
