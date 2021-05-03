
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 44;
		int amount = 45;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertTrue(account.getBalance() >= 0);
	}

}
