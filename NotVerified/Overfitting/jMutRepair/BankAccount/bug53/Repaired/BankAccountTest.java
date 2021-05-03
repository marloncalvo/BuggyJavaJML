
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
        int balance = 5700;
        BankAccount account = new BankAccount(balance);
        assertEquals(account.interestAfterYear(), balance/100);
	}

}
