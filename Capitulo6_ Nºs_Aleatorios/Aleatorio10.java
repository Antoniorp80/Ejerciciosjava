/**
 *Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 *El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 *uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 *aleatoria entre 1 y 40 caracteres.
 *
 * @author Antonio R.P.
 */
public class Aleatorio10 {
  public static void main(String[] args) {
    System.out.println ("Pintalíneas");
    int r = 0;
    int largo = 0;
    String relleno = "";
    
    for (int i= 1; i <= 10; i++) {
      largo = (int)(Math.random()* 40) + 1;
      r = (int)(Math.random()* 6 ); 
      
      switch(r) {
        case 0:
          relleno = "*";
          break;
          
        case 1:
          relleno = "-";
          break;
        
        case 2:
          relleno = "=";
          break;
          
        case 3:
          relleno = ".";
          break;
          
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      for (int a = 0; a <= largo; a++) {
        System.out.print (relleno);
      }
      System.out.println();
    }
  }
}
