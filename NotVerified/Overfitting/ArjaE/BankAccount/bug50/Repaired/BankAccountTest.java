
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 2147481709;
		int amount = 173;
		BankAccount account = new BankAccount(balance);
		account.ATMWithdraw(amount);
		assertEquals(balance-(amount+4), account.getBalance());
	}

}
