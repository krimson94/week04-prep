import java.util.Scanner;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      System.out.print("What is the model year of the car? ");
      int userYear = scnr.nextInt();
      System.out.print("What was the purchase price of the car? ");
      int userPrice = scnr.nextInt();
      System.out.print("What is the current year? ");
      int userCurrentYear = scnr.nextInt();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      myCar.printInfo();

      scnr.close();
   }
}