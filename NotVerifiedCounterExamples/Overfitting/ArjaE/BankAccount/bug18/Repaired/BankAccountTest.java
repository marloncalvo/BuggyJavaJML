package ArjaE.BankAccount.bug18.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int option = 2;
		int amount = 16;
		int balance = 39;
		BankAccount account = new BankAccount(balance);
		assertEquals(balance-amount, account.menu(option, amount));
	}
	
	@Test
	void test0() {
		int balance = 16732;
		int amount = 7188;
		BankAccount account = new BankAccount(balance);
		account.withdraw(amount);
		assertEquals(balance-amount, account.getBalance());
	}

}
