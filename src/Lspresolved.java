//we can resolve the lsp violation with the help of creating by extending the interface of deposit and creating another interfsce void withdraw
//isse hoga kya savings aur current account withdraw method ko override karenge but fixed deposit wala nahi karega

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface DepositonlyAccount  {
    void deposit(double amount);
}

interface withdrawAccount extends DepositonlyAccount {
    void withdraw(double amount);
}
class SavingsAccount implements withdrawAccount {
    private double balance;
    public SavingsAccount() {
        balance=0;
    }
    @Override
    public void deposit(double amount ) {
        balance=balance+amount;
System.out.println("Total amount in the account after adding amount :" +amount+" in your savingsAccount is : " +balance);
    }
    @Override
    public void withdraw(double  amount ) {
    if(balance>amount) {
        balance=balance-amount;
        System.out.println("balance after withdrawl is "+balance);
    }
    else if(balance ==amount) {
        System.out.println("WARNING YOU WILL BE LEFT WITH ZERO BALANCE IF YOU TRY TO WITHDRAW THIS AMOUNT "+amount);
        String ProceedFurther;
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to proceed further ");


    }
    else {
        System.out.println("insufficient balance can not process further ");
    }
    }
}

class CurrentAccount implements withdrawAccount {
    private double balance;
    public CurrentAccount(){
        balance=0;
    }

    @Override
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("the total ablance after adding the amount is : "+balance);
    }
    public void withdraw(double amount) {
    if(balance > amount) {
balance=balance - amount;
System.out.println("balance after withdrawl of amount is  :"+balance);
    }
    else {
        System.out.println("SORRY INSUFFICIENT BALANCE CANNOT PROCEED FURTHER ");
    }
    }

}
class Fixeddeposit implements DepositonlyAccount {
    private double balance;

    public Fixeddeposit() {
        balance=0;
    }
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("after deposotng money the amount is  :" +amount);
    }

}class BankClient {
    private List<withdrawAccount> withdrawableAccounts;
    private List<DepositonlyAccount> depositOnlyAccounts;

    public BankClient(List<withdrawAccount> withdrawableAccounts,
                      List<DepositonlyAccount> depositOnlyAccounts) {
        this.withdrawableAccounts = withdrawableAccounts;
        this.depositOnlyAccounts = depositOnlyAccounts;
    }

    public void processTransactions() {
        for (withdrawAccount acc : withdrawableAccounts) {
            acc.deposit(1000);
            acc.withdraw(500);
        }
        for (DepositonlyAccount acc : depositOnlyAccounts) {
            acc.deposit(5000);
        }
    }
}
public class Lspresolved {
    List<withdrawAccount> withdrawableAccounts = new ArrayList<>();
//        withdrawableAccounts.add(new SavingsAccount());
//        withdrawableAccounts.add(new CurrentAccount());
//    BankClient bc =new BankClient( withdrawableAccounts, depositOnlyAccounts);

}
