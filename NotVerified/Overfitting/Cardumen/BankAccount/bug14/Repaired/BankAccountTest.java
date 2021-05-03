
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void case1() {
		int balance = 1797;
		int amount = 1797;
		
		BankAccount account = new BankAccount(balance);
		account.deposit(amount);
		
		assertEquals(account.getBalance(), balance + amount);
	}

	@Test
	void case2() {
		int balance = 8365;
		int amount = -2147480761;
		
		BankAccount account = new BankAccount(balance);
		account.deposit(amount);
		
		assertEquals(account.getBalance(), balance);
	}
}
