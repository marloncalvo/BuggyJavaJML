package ArjaE.BankAccount.bug50.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		int balance = 2147481709;
		int amount = 173;
		BankAccount account = new BankAccount(balance);
		account.ATMWithdraw(amount);
		assertEquals(balance-(amount+4), account.getBalance());
	}

}
