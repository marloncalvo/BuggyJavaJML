package Cardumen.BankAccount.bug53.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
        int balance = 20000;
        BankAccount account = new BankAccount(balance);
        assertEquals(account.interestAfterYear(), balance/100);
	}

}
