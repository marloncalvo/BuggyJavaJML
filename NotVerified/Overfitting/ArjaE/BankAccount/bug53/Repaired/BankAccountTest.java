
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 10000;
		BankAccount account = new BankAccount(balance);
		assertEquals(balance/100, account.interestAfterYear());
	}

}
