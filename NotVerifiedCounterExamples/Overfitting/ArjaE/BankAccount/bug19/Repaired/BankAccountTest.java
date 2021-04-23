package ArjaE.BankAccount.bug19.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

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
