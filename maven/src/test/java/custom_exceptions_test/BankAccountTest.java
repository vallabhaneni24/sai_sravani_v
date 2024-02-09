package custom_exceptions_test;

import custom_exceptions.BankAccount;
import custom_exceptions.InsufficientFundsException;
import custom_exceptions.InvalidWithdrawlException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTest {

    @Test
    public void testWithdrawSufficientFunds() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(500);
            assertEquals(500, account.getBalance(), 0);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
            fail("Expected InsufficientFundsException was not thrown");
        } catch (InsufficientFundsException e) {
            assertEquals("Insufficient funds for withdrawal", e.getMessage());
        } catch (InvalidWithdrawlException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(-200);
            fail("Expected InvalidWithdrawalException was not thrown");
        } catch (InvalidWithdrawlException e) {
            assertEquals("Withdrawal amount cannot be negative", e.getMessage());
        } catch (InsufficientFundsException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}