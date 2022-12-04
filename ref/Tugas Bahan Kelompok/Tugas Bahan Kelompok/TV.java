class TV {
  // Deklarasi atrribut
  private String power;
  private int channel;
  private int volume;

  // Konstruktor
  public TV() {
    power = "OFF";
    channel = 0;
    volume = 0;
  }

  // Selector
  public String getPower() {
    return(power);
  }

  public int getChannel() {
    return(channel);
  }

  public int getVolume() {
    return(volume);
  }

  public String getNamaStatsiunTV() {
    String nama[] = new String[5];
    nama[0] = "RCTI";
    nama[1] = "SCTV";
    nama[2] = "Metro TV";
    nama[3] = "Trans TV";
    nama[4] = "Trans 7";

    return(nama[channel-1]);
  }

  public String getNamaAcara() {
    String acara[] = new String[5];
    acara[0] = "Seputar Indonesia";
    acara[1] = "Liputan 6 Pagi";
    acara[2] = "Kick Andy";
    acara[3] = "Wisata Kuliner";
    acara[4] = "Moto GP";

    return(acara[channel-1]);
  }

  // Mutator
  public void setPower(String p) {
    power = p;
  }

  public void setChannel(int c) {
    channel = c;
  }

  public void setVolume(int v) {
    volume = v;
  }
}