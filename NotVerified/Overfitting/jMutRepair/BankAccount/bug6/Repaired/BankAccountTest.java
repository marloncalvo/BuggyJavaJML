
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 8855;
		int amount = 0;
		BankAccount account = new BankAccount(balance);
		assertFalse(account.isValid(amount));
	}

}
