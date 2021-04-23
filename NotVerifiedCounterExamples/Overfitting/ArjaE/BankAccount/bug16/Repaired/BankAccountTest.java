package ArjaE.BankAccount.bug16.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 4569;
		int amount = 2773;
		BankAccount account = new BankAccount(balance);
		account.withdraw(amount);
		assertEquals(balance - amount, account.getBalance());
	}

	@Test
	void test0() {
		int balance = 1;
		int amount = -2147483365;
		BankAccount account = new BankAccount(balance);
		account.withdraw(amount);
		assertEquals(balance, account.getBalance());
	}
}
