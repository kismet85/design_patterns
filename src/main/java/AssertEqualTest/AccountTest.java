package AssertEqualTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @Before
    public void setAccount() { account = new Account(); }

    @Test
    public void testDeposit() {
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.deposit(1000);
        assertEquals(500, account.withdraw(500));
    }

    @Test
    public void testWithdrawingMoreThanBalance() {
        account.deposit(500);
        assertEquals(0, account.withdraw(1000));
    }

    @After
    public void tearDown() {
        account = null;
    }
}