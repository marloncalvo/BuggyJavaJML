
import static org.junit.Assert.*;
import org.junit.Test;
public class AlphabetTest {
	@Test
	void case1() {
		char c = 'e';
		Alphabet driver = new Alphabet(c);
		assertFalse(driver.getLowercase_set());
	}
	
	@Test
	void case2() {
		char c = 'a';
		Alphabet driver = new Alphabet(c);
		assertTrue(driver.isLowercase());
		assertTrue(driver.lowercase_set);
	}

}
