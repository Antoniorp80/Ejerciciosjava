/**
 * Salida formateada horario a color
 *
 * @author Antonio RP
 */


public class Ejercicio05 {
  public static void main(String[] args) {
   
    String rei = "\u001B[0m"; /*resetear color*/
    String red = "\033[31m";
    String ver = "\033[32m";
    String nar = "\033[33m";
    String azu = "\033[34m";
    String ama = "\033[1;33m";
    String cya = "\033[0;36m"; 
    String azc = "\033[1;34m";

  

    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","08:15-09:15",red+"S.I.",cya+"Prog.",cya+"Prog.",azu+"B.D.",ver+"L.M."+rei);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","09:15-10:15",red+"S.I.",cya+"Prog.",cya+"Prog.",azu+"B.D.",ver+"L.M."+rei);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","10:15-11:15",red+"S.I.",cya+"Prog.",ver+"L.M.",azu+"B.D.",nar+"E.D."+cya);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","11:15-11:45",azc+"R",azc+"E",azc+"CR",azc+"E",azc+"O"+rei);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","11:45-12:45",ama+"FOL.",azu+"B.D.",ver+"L.M.",cya+"Prog.",red+"S.I."+rei);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","12:45-13:45",ama+"FOL.",azu+"B.D.",nar+"E.D.",cya+"Prog.",red+"S.I."+rei);
    System.out.printf("%-15s  %-15s  %-15s  %-15s  %-15s  %-15s\n","13:45-14:45",ama+"FOL.",azu+"B.D.",nar+"E.D.",cya+"Prog.",red+"S.I."+rei);
  }
}
