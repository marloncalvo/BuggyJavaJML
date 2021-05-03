
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 24;
		int amount = 14;
		BankAccount account = new BankAccount(balance);
		account.withdraw(amount);
		assertEquals(balance-amount, account.getBalance());
		assertEquals(-amount, account.getPreviousTransaction());
	}

}
