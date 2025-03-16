import org.example.Account;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTests {

    @Test
    public void testDeposit() {
        Account account = new Account(0.0);
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdrawal() {
        Account account = new Account(100.0);
        assertTrue(account.withdraw(50.0));
        assertFalse(account.withdraw(200.0));
        assertEquals(50.0, account.getBalance());
    }
}
