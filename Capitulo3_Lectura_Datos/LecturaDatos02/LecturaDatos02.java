public class LecturaDatos02 {
  public static void main(String[] args) {

    String linea;
    double Euros = 166.386;
    System.out.printf("euros %8.2f\n", Euros);
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int numero;
    numero = Integer.parseInt( linea );


    double total;
    total = numero*Euros;

    System.out.print("El primer número introducido es " + numero);
    System.out.println(" y el segundo es " + Euros);
    System.out.print("la multiplicación del  primer número por el segundo es ");
    System.out.print(total);   
  } 
}
