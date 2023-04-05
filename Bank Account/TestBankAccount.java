import java.util.ArrayList;
public class TestBankAccount {
    public static void main(String[] args) {

    BankAccount account = new BankAccount(1000.0, 500.0);


        account.setCheckingBalance(1000.0);
        account.setSavingsBalance(500.0);


        System.out.println("Checking Balance: " + account.getcheckingBalance());
        
        System.out.println("Saving Balance: " +   account.getsavingsBalance());

        System.out.println("Total Balance: " +  BankAccount.getTotalBalance());

        System.out.println("Deposit: " +  BankAccount.deposit(200.0));

         System.out.println("Current Balance : " + BankAccount.getTotalBalance());

        System.out.println("Withdrawal: " +  BankAccount.withdraw(2000.0));

        System.out.println("Current Balance : " + BankAccount.getTotalBalance());

    }
}
