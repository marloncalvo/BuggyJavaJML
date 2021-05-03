package jMutRepair.BankAccount.bug53.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
        int balance = 5700;
        BankAccount account = new BankAccount(balance);
        assertEquals(account.interestAfterYear(), balance/100);
	}

}
