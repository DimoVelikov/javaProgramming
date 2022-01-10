package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setInfo("Dimo Velikov",777242342);

        account1.checkBalance();

        account1.deposit(1000);

        account1.checkBalance();

        account1.withdraw(500);
        account1.checkBalance();




    }
}
