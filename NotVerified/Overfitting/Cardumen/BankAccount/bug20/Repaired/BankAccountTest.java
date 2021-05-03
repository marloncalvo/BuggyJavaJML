
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	/**
	 * Technically, this test case has no failing input since the counterexample
	 * is for zero and zero, which has no penalty. Though, it executes functions it
	 * should not (based on specs).
	 */
	void case1() {
		int balance = 0;
		int amount = 0;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(account.getBalance(), balance);
	}

}
