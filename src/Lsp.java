import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
}
class Savingssccount implements Account {

    double balance;
    long accountno;
    Savingssccount(long accountno) {
        this.accountno=accountno;
       balance =0;

    }

    @Override
   public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("deposited amount :"+ amount + "in your bank account no  : "+accountno);
    }

    public void withdraw(double amount) {

       if(balance>amount) {
           balance=balance-amount;
           System.out.println("amount withdran from your abmk account no " + accountno + "is :"+ amount);
       }
       else  {
           System.out.println("cant withdraw money sorry ");
       }
    }

}

class currentaccount implements Account {
   private double balance;
    private long accountno;
    currentaccount(long accountno) {
        this.accountno=accountno;
        balance =0;

    }

    @Override
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println("deposited amount :"+ amount + "in your bank account no  : "+accountno);
    }

    public void withdraw(double amount) {

        if(balance>amount) {
            balance=balance-amount;
            System.out.println("amount withdran from your abmk account no " + accountno + "is :"+ amount);
        }
        else  {
            System.out.println("cant withdraw money sorry ");
        }
    }
}

class FixedTermAccount implements Account {
    private double balance;

    public FixedTermAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Fixed Term Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed in Fixed Term Account!");
    }
}

class Client {
    private List<Account> accounts;
    public Client(List<Account> accounts) {
        this.accounts = accounts;
    }
    public void Processtransaction() {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            acc.deposit(1000);
            // ... rest of code

            try {
                acc.withdraw(500);
            } catch (UnsupportedOperationException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

}
public class Lsp {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Savingssccount(11212121));
        accounts.add(new currentaccount(45456454));
        accounts.add(new FixedTermAccount());

        Client client = new Client(accounts);
        client.Processtransaction(); // Throws exception when withdrawing from FixedTermAccount
    }
}
