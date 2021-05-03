package Cardumen.BankAccount.bug25.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 44;
		int amount = 45;
		BankAccount account = new BankAccount(balance);
		account.checkWithdrawal(amount);
		assertTrue(account.getBalance() >= 0);
	}

}
