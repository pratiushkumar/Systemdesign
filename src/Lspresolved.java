//we can resolve the lsp violation with the help of creating by extending the interface of deposit and creating another interfsce void withdraw
//isse hoga kya savings aur current account withdraw method ko override karenge but fixed deposit wala nahi karega

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

class CurrentAccount implements withdrawAccount {}

public class Lspresolved {
}
