public class Colors {
  public static void main(String[] args) {
    RGB fullRed = new RGB(255, 0, 0);
    RGB fullGreen = new RGB(0, 255, 0);
    RGB fullBlue = new RGB(0, 0, 255);

    System.out.println(fullRed.getRed());
    System.out.println(fullGreen.getGreen());
    System.out.println(fullBlue.getBlue());

    System.out.println(fullRed.getBlue());

    HLS hslColor = new HLS(240, 0.80f, 1);

    RGB rgbColor = hslColor.convertHSLtoRGB();

    System.out.println("RGB Color: " + rgbColor.getRed() + ", " + rgbColor.getGreen() + ", " + rgbColor.getBlue());
  }
}

interface Ifarve {
  // RGB
  int getRed();

  int getGreen();

  int getBlue();

}

class HLS {
  private int hue;
  private float sat;
  private float light;

  public HLS(int hue, float Saturation, float Lightness) {
    this.hue = hue;
    this.sat = Saturation;
    this.light = Lightness;
  }

  public RGB convertHSLtoRGB() {
    float C = 0;
    float X = 0;
    float M = 0;

    int red = 0;
    int blue = 0;
    int green = 0;
    // Calculate Chroma (farvens renhed)
    // C = (1 - |2L - 1|) * S
    C = ((1 - Math.abs(2 * light - 1)) * sat);
    if (C == 0) {
      X = 0;
    }
    // Mellemregning
    // X = C * (1 - |(H / 60) mod 2 - 1|)
    else {
      X = C * (1 - Math.abs((hue / 60) % 2 - 1));
    }
    // basismængden af lys
    M = light - C / 2;

    red = (int) ((C + M) * 255);
    green = (int) ((X + M) * 255);
    blue = (int) ((X + M) * 255);

    return new RGB(red, green, blue);
  }

}

class RGB implements Ifarve {
  private int red;
  private int green;
  private int blue;

  public RGB(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }

  // public String hslColor() {
  // System.out.println("HSL Color: " + hue + ", " + sat + ", " + light);
  // }

}
