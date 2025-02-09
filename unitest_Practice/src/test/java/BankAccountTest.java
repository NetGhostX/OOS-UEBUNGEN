
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class BankAccountTest {
    BankAccount myAccount = new BankAccount("A");
    BankAccount targetAccount = new BankAccount("B");

    @BeforeEach
    public void setAccountUp(){
        myAccount.deposit(100);
        targetAccount.deposit(100);
    }

    //testing negative withdrawal error

    @Test
    public void testNegativeWithdrawalException(){
        setAccountUp();
        System.out.println("Testing Negative Withdrawal error");
        assertThrows(NegativeWithDrawalError.class, () ->myAccount.withdraw(-20));
    }

    @Test
    public void checkTransfer(){
        assertNotNull(myAccount);
        assertNotNull(targetAccount);

        float myAccountCurrentBalance = myAccount.getBalance();
        float targetAccountCurrentBalance = targetAccount.getBalance();

        assertEquals(100,myAccount.getBalance());
        assertEquals(100, targetAccount.getBalance());

        int moneyTranser = 10;

        myAccount.transfer(myAccount,targetAccount,moneyTranser);

        assertEquals(myAccountCurrentBalance-10,myAccount.getBalance());
        assertEquals(targetAccountCurrentBalance+10,targetAccount.getBalance());
    }



    @RepeatedTest(10)
    @DisplayName("Test transfer with random values")
    public void transferTest2(){
        System.out.println("repeated 10 test");
        float currentBalance = myAccount.getBalance();
        float currentTargetBalance = targetAccount.getBalance();
        myAccount.transfer(targetAccount,myAccount,15);

        assertEquals(currentTargetBalance-15,targetAccount.getBalance());
        assertEquals(currentBalance+15,myAccount.getBalance());
    }





    @Test
    void testTransfer() {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount("Kelvin");
        account1.setBalance(100);  // Set balance for account1

        BankAccount account2 = new BankAccount("Magda");
        account2.deposit(10);  // Deposit to account2

        // Initial balances
        float initialBalanceAccount1 = account1.getBalance();
        float initialBalanceAccount2 = account2.getBalance();

        System.out.println("Initial account1 balance: " + initialBalanceAccount1);
        System.out.println("Initial account2 balance: " + initialBalanceAccount2);

        // Transfer amount
        float transferAmount = 1;

        // Perform transfer from account1 to account2
        account1.transfer(account1, account2, transferAmount);

        // Expected balances after the transfer
        float expectedAccount1Balance = initialBalanceAccount1 - transferAmount;
        float expectedAccount2Balance = initialBalanceAccount2 + transferAmount;

        System.out.println("Expected Account Balance of Account1: " + expectedAccount1Balance);
        System.out.println("Expected Account Balance of Account2: " + expectedAccount2Balance);

        // Assertions
        assertEquals(expectedAccount1Balance, account1.getBalance(), "Account1 balance is incorrect after transfer");
        assertEquals(expectedAccount2Balance, account2.getBalance(), "Account2 balance is incorrect after transfer");
    }
}
