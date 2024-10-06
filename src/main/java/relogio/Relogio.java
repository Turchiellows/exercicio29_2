package relogio;

public class Relogio {

   // ATTRIBUTES ===============================================================
   public int horas;
   public int minutos;
   public int segundos;

   // CONSTRUCTORS =============================================================
   public Relogio() {
      // DEFAULT
      this(0, 0, 0);
   }

   public Relogio(int hora, int minuto, int segundo) {
      // VALIDATE
      if (hora < 0 || hora > 59) {
         hora = 0;
      }
      if (minuto < 0 || minuto > 59) {
         minuto = 0;
      }
      if (segundo < 0 || segundo > 59) {
         segundo = 0;
      }

      // DEFAULT
      this.horas = hora;
      this.minutos = minuto;
      this.segundos = segundo;
   }

   // GETTERS AND SETTERS ======================================================
   public int getHoras() {
      return horas;
   }

   public int getMinutos() {
      return minutos;
   }

   public int getSegundos() {
      return segundos;
   }

   public void setHoras(int horas) {
      // VALIDATE
      if (horas < 0 || horas > 59) {
         horas = 0;
      }
      this.horas = horas;
   }

   public void setMinutos(int minutos) {
      // VALIDATE
      if (minutos < 0 || minutos > 59) {
         minutos = 0;
      }
      this.minutos = minutos;
   }

   public void setSegundos(int segundos) {
      // VALIDATE
      if (segundos < 0 || segundos > 59) {
         segundos = 0;
      }
      this.segundos = segundos;
   }

   // METHODS ==================================================================
   // GET TIME
   public String getTime() {
      String result = String.format("%02d", getHoras()) + ":" + String.format("%02d", getMinutos()) + ":" + String.format("%02d", getSegundos());
//      String result = getHoras() + ":" + getMinutos() + ":" + getSegundos();
      return result;
   }

   // GET TIME IN SECONDS
   public int getTimeSeconds() {
      int result = getHoras() * 3600 + getMinutos() * 60 + getSegundos();
      return result;
   }

   // INCREMENT ++++++++++++++++++++++++++
   public void incHoras() {
      // GET CURRENT
      int horaAtual = getHoras();
      horaAtual++;

      // SET NEW VALUE
      if (horaAtual > 23) {
         setHoras(0);
         setSegundos(0);
         setMinutos(0);
      } else {
         setHoras(horaAtual);
      }
   }

   public void incMinutos() {
      // GET CURRENT
      int minutoAtual = getMinutos();
      minutoAtual++;

      // SET NEW VALUE
      if (minutoAtual > 59) {
         incHoras();
         setMinutos(0);
      } else {
         setMinutos(minutoAtual);
      }
   }

   public void incSegundos() {
      // GET CURRENT
      int segundoAtual = getSegundos();
      segundoAtual++;

      // SET NEW VALUE
      if (segundoAtual > 59) {
         incMinutos();
         setSegundos(0);
      } else {
         setSegundos(segundoAtual);
      }
   }

   // DECREMENT ++++++++++++++++++++++++++
   public void decHoras() {
      // GET CURRENT
      int horaAtual = getHoras();
      horaAtual--;

      // SET NEW VALUE
      if (horaAtual < 0) {
         setHoras(23);
         setMinutos(59);
         setSegundos(59);
      } else {
         setHoras(horaAtual);
      }
   }

   public void decMinutos() {
      // GET CURRENT
      int minutoAtual = getMinutos();
      minutoAtual--;

      // SET NEW VALUE
      if (minutoAtual < 0) {
         decHoras();
         setMinutos(59);
      } else {
         setMinutos(minutoAtual);
      }
   }

   public void decSegundos() {
      // GET CURRENT
      int segundoAtual = getSegundos();
      segundoAtual--;

      // SET NEW VALUE
      if (segundoAtual < 0) {
         decMinutos();
         setSegundos(59);
      } else {
         setSegundos(segundoAtual);
      }
   }

}
