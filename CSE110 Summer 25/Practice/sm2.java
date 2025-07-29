import java.util.Scanner;

public class sm2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the initial price of an oxygen cylinder in 1999: ");
    double oxyInit = sc.nextDouble();
    System.out.print(
      "Enter the initial price of a unit of water reserve in 1999: ");
    double waterInit = sc.nextDouble();
    System.out.print(
      "Enter the monthly inflation rate (percentage) for oxygen cylinders: ");
    double p = sc.nextDouble();
    System.out.print(
      "Enter the monthly inflation rate (percentage) for water reserves: ");
    double q = sc.nextDouble();

    int years = 2024 - 1999;
    int months = years * 12;

    double oxyPrice = oxyInit;
    double waterPrice = waterInit;

    for (int i = 0; i < months; i++) {
      oxyPrice = oxyPrice + ((oxyPrice * p) / 100.0);
      waterPrice = waterPrice + ((waterPrice * q) / 100.0);
    }

    System.out.println("Current price of an oxygen cylinder: "+oxyPrice);
    System.out.println("Current price of a unit of water reserve: "+waterPrice);

    double oxyIncrease = oxyPrice - oxyInit;
    double waterIncrease = waterPrice - waterInit;

    if (oxyIncrease > waterIncrease) {
      System.out.println("The price of oxygen cylinders has increased more.");
    } else if (waterIncrease > oxyIncrease) {
      System.out.println("The price of water reserves has increased more.");
    } else {
      System.out.println("Both prices have increased equally.");
    }
    sc.close();
  }
}

