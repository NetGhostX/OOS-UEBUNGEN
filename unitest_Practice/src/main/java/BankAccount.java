import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
    private float balance;
    private String name;
    private final long bankAccId;

    public BankAccount(String name) {
        this.name = name;
        this.bankAccId = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount)throws NegativeWithDrawalError {
        if (amount <= balance) {
            this.balance -= amount;
        }
        throw new NegativeWithDrawalError("Insufficient balance to withdraw ");
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float amount){
        this.balance += amount;
    }
    public long getBankAccId() {
        return this.bankAccId;
    }

    public void transfer(BankAccount senderAccount, BankAccount recipient, float amount) {
        if (senderAccount != null && recipient != null) {
            senderAccount.balance -= amount;
            recipient.balance += amount;
        }
    }



    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Kelvin");
        account1.balance = 99999999;
        BankAccount account2 = new BankAccount("Magda");
        account2.balance = 1000000;

        System.out.println("Account: " + account1.name + "\nBalance: " + account1.balance);
        System.out.println("Account: " + account2.name + "\nBalance: " + account2.balance);

        // Transfer 500000 from account1 to account2
        account1.transfer(account1, account2, 500000);

        System.out.println("\nAfter transfer:");
        System.out.println("Account: " + account1.name + "\nBalance: " + account1.balance);
        System.out.println("Account: " + account2.name + "\nBalance: " + account2.balance);
    }
}
