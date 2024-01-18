import java.util.Scanner;

class Main {
  static int userChoice;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int qSedan=0;
    int qSUV=0;
    int qSportsCar=0;
    int qHatchback=0;
    int qConvertible=0;
    int qLuxuryCar=0;
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
        // Clear the buffer to prevent an infinite loop
        sc.nextLine();
        continue;
      }

      if (userChoice == 7) {
        break; // Exit the loop if the user chooses to quit
      }
      else {
        
        if (userChoice==1){
          do{
        System.out.println("Enter the Quantity.");
        int qSedan=sc.nextInt()
      }
    }

    sc.close();
  }

  static boolean InputValidator(int a) {
    return a < 1 || a > 7;
  }
}
