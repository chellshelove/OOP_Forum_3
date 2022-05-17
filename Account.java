import java.util.Scanner;

public class Account{

  static int accountNumber, Balance, amount;
  Scanner input = new Scanner(System.in);
  static String name, actype;
  public int deposit() {
    System.out.print("Enter deposit amount:");
    amount = input.nextInt();
    if (amount < 0) {
      System.out.println("Invalid");
      return 1;
    }
    Balance = Balance + amount;
    return 0;
  }

  int withdraw()  {

    if (Balance < amount) {
      System.out.println("Not enough funds.");
      return 1;
    }
    if (amount < 0) {
      System.out.println("Invalid");
      return 1;
    }
    Balance = Balance - amount;
    return 0;
  }

}