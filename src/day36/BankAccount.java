package day36;

public class BankAccount {

    private String accountHolder;
    private float accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if(accountHolder.isEmpty()){
            System.err.println("Name can not be empty");
            System.exit(0);
        }
        this.accountHolder = accountHolder;
    }

    public float getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(float accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0){
            System.err.println("Balance can not be negative");
            System.exit(0);
        }
        this.balance = balance;
    }


    public BankAccount(String accountHolder, float accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double deposit){
        balance +=deposit;
    }

    public void withdraw(double withdraw){balance -= withdraw;}

    public void checkBalance(){
        System.out.println(balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Dimo Velikov", 1515557898,1000);

        System.out.println(bankAccount1);

        bankAccount1.checkBalance();

        bankAccount1.deposit(500);

        bankAccount1.withdraw(100);

        bankAccount1.checkBalance();


    }
}
