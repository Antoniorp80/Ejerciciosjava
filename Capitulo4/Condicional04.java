/**
 *
 * Programa para saludar según la hora introducida.
 *
 * @author Antonio R.P.
 */

public class  Condicional04 {
  public static void main(String[] args) {
      
    int salarioSemanal;
    
    System.out.print("Por favor, introduzca horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <= 40) {
    salarioSemanal = 12 * horasTrabajadas;
    }else { 
    salarioSemanal = (40*12) + ((horasTrabajadas-40)*16);
    System.out.println ("Tu salario de esta semana es de " + salarioSemanal + " euros");

    }
  }
}
