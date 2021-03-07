package Cardumen.BankAccount.bug20.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

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
