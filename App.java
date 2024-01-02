// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;
    int amount;
    firstName = "John";
    lastName = "Doe";
    age = 24;
    amount = 178;
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(age);
    System.out.println(amount);
    boolean ismarried = false;
    double amountt = 20;
    String deposit = "Deposit";
    String withdraw = "Withdraw";
    System.out.println("The amount is " + amountt);
    System.out.println("Would you like to Deposit or Withdraw the amount?");
    amountt = 30;
    System.out.println("The amount is " + amountt);
    int amounttt = 5;
    System.out.println(amounttt + " plus " + amounttt + " is " + (amounttt + amounttt));
    String fullName = " John doe";
    System.out.println("My name is " + firstName.toUpperCase() + " and my last name length is " + lastName.length());

    System.out.println(fullName.substring(6).startsWith("d"));

      double amountKWD = 86;
      double amountUSD = amountKWD * 3.25;
      System.out.println(amountKWD + " KWD = " + amountUSD + " USD");
    double amountKWD2 = amountUSD / 3.25;
    double amountEUR = amountKWD * 3.42;
    System.out.println(amountKWD2 + " KWD = " + amountEUR + " EUR");
    

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}