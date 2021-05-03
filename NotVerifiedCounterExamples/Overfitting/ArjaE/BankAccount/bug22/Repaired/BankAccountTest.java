package ArjaE.BankAccount.bug22.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 25;
		int amount = 24;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(balance-amount, account.getBalance());
	}

	// False negative
	@Test
	void test0() {
		int balance = 2147483647;
		int option = 3;
		int amount = 26;
		BankAccount account = new BankAccount(balance);
		assertEquals(balance-amount, account.menu(option, amount));
		assertEquals(-amount, account.getPreviousTransaction());
	}
	
}
