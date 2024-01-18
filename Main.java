import java.util.Scanner;

class Main {
  static int userChoice;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    

    System.out.println("A1A Carwash");
    // Using Escape sequence character to get a good formatting of output:)
    System.out.println("Type Of Car\t\t\t Price");
    System.out.println("1. Sedan\t\t\t $20,000\n2. SUV\t\t\t\t $30,000");
    System.out.println("3. Sports Car\t\t $40,000\n4. Hatchback\t\t $18,000");
    System.out.println("5. Convertible\t\t $35,000\n6. Luxury Car\t\t $50,000");
    System.out.println("7. Quit");
  System.out.println("Enter Below( 1 to 7): ");
  try{
  userChoice=sc.nextInt();
  InputValidator(userChoice);
  }
  catch(exception e){
    System.out.println("Enter a String Please");
  }
  }
  static void InputValidator(int a){
    
  }

}