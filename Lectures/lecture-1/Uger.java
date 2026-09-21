import java.utils.Scanner;

public class Uger {
  public static void main(String[] args) {

  private long SEKUNDER_I_MINUT = 60;
  private long SEKUNDER_I_TIME = SEKUNDER_I_MINUT * 60;
  private long SEKUNDER_I_DAG = SEKUNDER_I_TIME * 24;
  private long SEKUNDER_I_UGE = SEKUNDER_I_DAG * 7;

  Scanner scanner = new Scanner(System.in);
  long sekunder = scanner.nextLong();

  long uger = sekunder / SEKUNDER_I_UGE;
  long sekunder = sekunder % SEKUNDER_I_UGE;

  String output = String.format("%d uger, %d dage, %d timer, %d minutter, %d sekunder", uger, dage, timer, minutter,
      sekunder);

}
