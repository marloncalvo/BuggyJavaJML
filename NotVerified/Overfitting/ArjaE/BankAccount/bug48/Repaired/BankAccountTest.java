
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 1796;
		int _balance = 8365;
		int _amount = 2147483647;
		BankAccount account = new BankAccount(balance);
		assertFalse(account.isValid(_balance, _amount));
		assertEquals(balance, account.getBalance());
	}
	
	@Test
	void test0() {
		int balance = 1142;
		int _balance = 282;
		int _amount = 282;
		BankAccount account = new BankAccount(balance);
		assertTrue(account.isValid(_balance, _amount));
		assertEquals(balance, account.getBalance());
	}

	@Test
	void test1() {
		int balance = 1142;
		int _balance = 536;
		int _amount = 536;
		BankAccount account = new BankAccount(balance);
		assertTrue(account.isValid(_balance, _amount));
		assertEquals(balance, account.getBalance());
	}
	
}
