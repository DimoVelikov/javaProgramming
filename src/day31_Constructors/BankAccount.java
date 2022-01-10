package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;


    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("balance= $" + balance);
    }

    public void deposit(double deposit){

        if(deposit<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }

        balance += deposit;

    }

    public void withdraw(double withdraw){
        if(withdraw<=0){
            System.out.println("Withdraw amount can not be zero or negative");
            return;
        }
        if(withdraw>balance){
            System.out.println("Insufficient balance");
            return;
        }

        balance -= withdraw;
    }

}
