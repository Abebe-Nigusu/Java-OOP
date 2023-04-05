import java.util.ArrayList;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;

    private static int accountsCount;
    private static double totalBalance;


    public BankAccount( double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        BankAccount.totalBalance = checkingBalance + savingsBalance;
        BankAccount.accountsCount++;
    }

   

   public double getcheckingBalance(){
        return this.checkingBalance;
    }
   public double getsavingsBalance(){
        return this.savingsBalance;
    }


    public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
    }
       
    public void setSavingsBalance(double savingsBalance){
    this.savingsBalance += savingsBalance;
    }

    public static double deposit(double amount){
        return  BankAccount.totalBalance += amount;
    }
    public static double withdraw(double amount){
       if(amount > BankAccount.totalBalance){
        System.out.println("Insufficient balance to withdraw");
        return BankAccount.totalBalance;
       }
       return BankAccount.totalBalance -= amount;

 
    }

     public static double getTotalBalance(){
       return BankAccount.totalBalance;
    }

    
}