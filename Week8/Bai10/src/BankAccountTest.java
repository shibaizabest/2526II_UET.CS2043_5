import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("123", "Thinh Luu", 500.0);
    }

    @Test
    void testDeposit_Valid() {
        account.deposit(100.0);
        assertEquals(600.0, account.getBalance());
    }

    @Test
    void testDeposit_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-1));
    }

    @Test
    void testWithdraw_Success() {
        assertTrue(account.withdraw(500.0));
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testWithdraw_FailsDueToBalance() {
        assertFalse(account.withdraw(500.01));
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testWithdraw_InvalidAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }

    @Test
    void testConsistencyFlow() {
        BankAccount flowAcc = new BankAccount("456", "Thinh Test", 0.0);

        flowAcc.deposit(500.0);
        assertTrue(flowAcc.withdraw(200.0));
        assertFalse(flowAcc.withdraw(400.0));

        assertEquals(300.0, flowAcc.getBalance());
    }
}