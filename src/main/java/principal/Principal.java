package principal;

import java.io.IOException;
import relogio.Relogio;
import java.util.Scanner;

public class Principal {

   public static void main(String[] args) throws InterruptedException, IOException {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARE
      int opt;
      int hora;
      int minuto;
      int segundo;

      // SET CLOCK
      System.out.print("Hora    : ");
      hora = sc.nextInt();
      System.out.print("Minuto  : ");
      minuto = sc.nextInt();
      System.out.print("Segundo : ");
      segundo = sc.nextInt();
      Relogio casio = new Relogio(hora, minuto, segundo);

      // CHOOSE
      System.out.println("\n\n========================================================");
      System.out.println("Escolha uma opção:");
      System.out.println("========================================================");
      System.out.println("0 - Incrementar");
      System.out.println("1 - Decrementar");
      System.out.print("\nSua escolha: ");
      opt = sc.nextInt();
      System.out.println("");

      // RUN
      if (opt == 0) {
         // INCREASE
         for (int i = 0; i < 10000; i++) {
            casio.incSegundos();
            System.out.println("CASIO : " + casio.getTime());
            Thread.sleep(1000);
         }
      } else {
         // DECREASE
         for (int i = 0; i < 10000; i++) {
            casio.decSegundos();
            System.out.println("CASIO : " + casio.getTime());
            Thread.sleep(1000);
         }
      }

   }
}
