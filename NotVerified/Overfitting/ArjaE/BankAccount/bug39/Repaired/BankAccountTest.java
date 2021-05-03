
import static org.junit.Assert.*;
import org.junit.Test;
public class BankAccountTest {
	@Test
	void test() {
		int balance = 181594;
		int option = 7;
		int amount = 2045016300;
		BankAccount account = new BankAccount(balance);
		int _amount = amount - (amount/100)*5;
		assertEquals(balance+_amount, account.menu(option, amount));
		assertEquals(balance+_amount, account.getBalance());
		assertEquals(_amount, account.getPreviousTransaction());
	}
	
	@Test
	void test0() {
		int balance = 300005;
		int option = 7;
		int amount = 306120;
		BankAccount account = new BankAccount(balance);
		int _amount = amount - (amount/100)*5;
		assertEquals(balance+_amount, account.menu(option, amount));
		assertEquals(balance+_amount, account.getBalance());
		assertEquals(_amount, account.getPreviousTransaction());
	}

}
