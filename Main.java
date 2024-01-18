import java.util.Scanner;

class Main {
  static int userChoice;
  static int qSedan = 0;
  static int qSUV = 0;
  static int qSportsCar = 0;
  static int qHatchback = 0;
  static int qConvertible = 0;
  static int qLuxuryCar = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int customer = 1; customer <= 5; customer++) {
      double totalAmount = 0;

      while (true) {
        System.out.println("A1A Carwash");
        System.out.println("Type Of Car\t\t\t Price");
        System.out.println("1. Sedan\t\t\t $20,000\n2. SUV\t\t\t\t $30,000");
        System.out.println("3. Sports Car\t\t $40,000\n4. Hatchback\t\t $18,000");
        System.out.println("5. Convertible\t\t $35,000\n6. Luxury Car\t\t $50,000");
        System.out.println("7. Quit");
        System.out.println("Enter Below (1 to 7): ");

        try {
          userChoice = sc.nextInt();
          if (InputValidator(userChoice)) {
            System.out.println("Error: Invalid input. Enter a number between 1 and 7.");
            continue;
          }
        } catch (Exception e) {
          System.out.println("Error: Unexpected input. Please enter a number.");
          sc.nextLine(); 
          continue;
        }

        if (userChoice == 7) {
          break; // Exit the loop if the user chooses to quit
        } else {
          System.out.println("Enter the Quantity:");
          int quantity = sc.nextInt();

          switch (userChoice) {
            case 1:
              qSedan += quantity;
              totalAmount += 20000 * quantity;
              break;
            case 2:
              qSUV += quantity;
              totalAmount += 30000 * quantity;
              break;
            case 3:
              qSportsCar += quantity;
              totalAmount += 40000 * quantity;
              break;
            case 4:
              qHatchback += quantity;
              totalAmount += 18000 * quantity;
              break;
            case 5:
              qConvertible += quantity;
              totalAmount += 35000 * quantity;
              break;
            case 6:
              qLuxuryCar += quantity;
              totalAmount += 50000 * quantity;
              break;
          }
        }
      }

      // Calculate total bill with tax and discounts
      totalAmount += totalAmount * 0.13; // 13% tax

      if (totalAmount > 20000) {
        totalAmount -= totalAmount * 0.05; // 5% discount
      }

      if (totalAmount > 30000) {
        totalAmount -= totalAmount * 0.1; // 10% discount
      }

      System.out.println("Total Billing Amount for Customer " + customer + ": $" + totalAmount);
    }

    sc.close();
  }

  static boolean InputValidator(int a) {
    return a < 1 || a > 7;
  }
}
