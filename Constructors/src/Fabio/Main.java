package Fabio;

public class Main {
    public static void main(String[] args) {
//	     Create a new class for bank account
//         create fields for the bank account number, balance, customer name, email and phone number.
//
//         Create getters and setters for each field
//         Create two additional methods
//         1. To allow the customer to deposit funds ( this should increment the balance fields).
//         2. To allow the customer to withdraw funds. This should deduct from the balance field,
//         but not allow the withdrawal to complete if there are insufficient funds.
//         You will want to create various code in the Main class (the one created by IntelliJ) yo
//         confirm your code is working.
//         Add some System.out.println in the two methods above as well.
//
        BankAccount paulsAccount = new BankAccount(); //"12345", 0.00, "Paul Walker",
        // "paulw@gmail.com", "(087) 123-4567");

        System.out.println(paulsAccount.getNumber());
        System.out.println(paulsAccount.getBalance());

        paulsAccount.withdrawal(100.0);

        paulsAccount.deposit(50.0);
        paulsAccount.withdrawal(100.0);

        paulsAccount.deposit(51.0);
        paulsAccount.withdrawal(100.0);

        BankAccount leesAccount = new BankAccount("Lee", "lee@gmail.com", "12345");
        System.out.println(leesAccount.getNumber() + " name " + leesAccount.getCustomerName());
        System.out.println("Current balance is " + leesAccount.getBalance());
        leesAccount.withdrawal((100.55));

//       ------- VipPerson----------
//         Create a new class VipCustomer
//         it should have 3 fields name, credit limit, and email address.
//         Create 3 constructors
//         1st constructor empty should call the constructor with 3 parameters with default values
//         2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
//         3rd constructor should have all fields
//         create getters only for this using code generation of intellij as setters won't be needed
//         test and confirm it works.

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Lee" , 100.00, "lee@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
