package ArjaE.BankAccount.bug20.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 1;
		int amount = -2147483648;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(balance, account.getBalance());
	}

	// False negative
	@Test
	void test0() {
		int balance = 1;
		int amount = 2147483038;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(0, account.getBalance());
		assertEquals(-balance, account.getPreviousTransaction());
	}
	
	// False negative
	@Test
	void test1() {
		int balance = 0;
		int amount = 2147475549;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(0, account.getBalance());
		assertEquals(0, account.getPreviousTransaction());
	}
	
	// False negative
	@Test
	void test2() {
		int balance = 51;
		int amount = 2147482505;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(balance-50, account.getBalance());
		assertEquals(-50, account.getPreviousTransaction());
	}
	
	@Test
	void test3() {
		int balance = 8985;
		int amount = 5988;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertEquals(balance-amount, account.getBalance());
		assertEquals(-amount, account.getPreviousTransaction());
	}
	
	// False negative
	@Test
	void test4() {
		int balance = 16;
		int option = 3;
		int amount = 1;
		BankAccount account = new BankAccount(balance);
		assertEquals(balance-amount, account.menu(option, amount));
		assertEquals(-amount, account.getPreviousTransaction());
	}
}
