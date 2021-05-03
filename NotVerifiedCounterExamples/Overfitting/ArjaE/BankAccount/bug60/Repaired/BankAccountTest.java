package ArjaE.BankAccount.bug60.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 300000;
		BankAccount account = new BankAccount(balance);
		assertEquals((balance/100)*3, account.interestAfterYear());
	}

}
