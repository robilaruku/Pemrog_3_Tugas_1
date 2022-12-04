import java.io.*;              

class DriverTV {              
  // Program utama
  public static void main(String arg[]) {        
    // Ciptakan objek
    TV tv = new TV();

    // Penciptaan objek untuk pembacaan data dari keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    int chn = 0;
    int vol = 0;
    try {
      // Baca channel dan volume
      System.out.println();
      System.out.print("Channel (1-5) : ");
      String cString = bufRead.readLine();
      chn = Integer.parseInt(cString);

      System.out.print("Volume        : ");
      String vString = bufRead.readLine();
      vol = Integer.parseInt(vString);

      // Manipulasi objek
      tv.setPower("ON");  // hidupkan TV
      tv.setChannel(chn); // pilih channel
      tv.setVolume(vol);  // atur volume

      System.out.println();
      System.out.println("Power   : "+tv.getPower());
      System.out.println("Volume  : "+tv.getVolume());
      System.out.println("Channel : "+tv.getChannel());
      System.out.println("  "+tv.getNamaStatsiunTV());
      System.out.println("  "+tv.getNamaAcara());
    }
    catch (IOException err) {
      System.out.println("Proses pembacaan gagal!");
    }
    catch (NumberFormatException err) {
      System.out.println("Nilai input tidak valid!");
    }
  }
}