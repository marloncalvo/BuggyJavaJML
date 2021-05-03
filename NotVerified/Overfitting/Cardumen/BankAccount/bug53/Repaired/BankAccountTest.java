
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
        int balance = 20000;
        BankAccount account = new BankAccount(balance);
        assertEquals(account.interestAfterYear(), balance/100);
	}

}
