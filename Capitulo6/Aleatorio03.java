/**
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 *48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 * @author Antonio R.P.
 */
public class Aleatorio03 {
  public static void main(String[] args) {
    System.out.println("Vamos a sacar una carta al azar: ");

    String palo = "";
    String carta = "";
    
    int numeroPalo = (int) (Math.random() * 4) + 1;
    switch (numeroPalo) {
      case 1:
      palo = "bastos";
      break;
      case 2:
      palo = "copas";
      break;
      case 3:
      palo = "oros";
      break;
      case 4:
      palo = "espadas";
      default:
    }

    int numeroCarta = (int) (Math.random() * 13) + 1;
    switch (numeroCarta) {
      case 1:
      carta = "As";
      break;
      case 11:
      carta = "Sota";
      break;
      case 12:
      carta = "Caballo";
      break;
      case 13:
      carta = "Reyes";
      default:
        carta = String.valueOf(numeroCarta);

    }
    System.out.println("Has sacado " + carta + " de " + palo +".");
  }
}
