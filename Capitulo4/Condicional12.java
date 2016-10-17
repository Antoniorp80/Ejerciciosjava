/**
 *
 *Programa que realiza un test y puntua las respuestas acertadas.
 *
 * @author Antonio R.P.
 */

public class  Condicional12 {
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println(" a) int\n b) double\n c) float"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println(" a) XML\n b) SELECT\n c) SQL"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println(" a) href\n b) a\n c) link"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println(" a) /etc\n b) /config\n c) /cfg"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println(" a) RAM\n b) EPROM\n c) ROM"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
        System.out.println("6. ¿Qué es una variable?");
    System.out.println(" a) un contenedor de información\n b) algo que cambia de sitio\n c) algo que no cambia de sitio"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
        System.out.println("6. ¿El operador lógico(7 > 2) && (2 < 4) significa que ");
    System.out.println(" a) ambos son verdaderos\n b) b el primero es falso y el segundo verdadero\n c) ambos son falsos"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    
        System.out.println("7. La sentencia if tiene como resultado evaluar la expresión lógica como...");
    System.out.println(" a) verdadero siempre\n b) falso siempre\n c) verdadero o falso"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
        System.out.println("8. ¿qué significa el operador de comparación a==b?");
    System.out.println(" a) a es distinto de b\n b) b es igual que a\n c) a es mayor o igual que b"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
        System.out.println("9. ¿qué significa el operador de comparación a<=b?");
    System.out.println(" a) a es distinto de b\n b) b es igual que a\n c) a menor o igual que b"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
        System.out.println("10. ¿qué significa el operador de comparación a!=b?");
    System.out.println(" a) a es distinto de b\n b) b es igual que a\n c) a es mayor o igual que b"); 
    System.out.print("introduzca la respuesta y pulse intro ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
