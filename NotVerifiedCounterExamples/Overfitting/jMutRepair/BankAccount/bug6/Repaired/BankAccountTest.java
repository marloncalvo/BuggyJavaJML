package jMutRepair.BankAccount.bug6.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 8855;
		int amount = 0;
		BankAccount account = new BankAccount(balance);
		assertFalse(account.isValid(amount));
	}

}
