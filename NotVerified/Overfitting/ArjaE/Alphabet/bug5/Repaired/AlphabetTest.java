
import static org.junit.Assert.*;
import org.junit.Test;
public class AlphabetTest {
	@Test
	void case1() {
		char c = 'e';
		Alphabet driver = new Alphabet(c);
		assertFalse(driver.isUppercase());
		assertFalse(driver.getUppercase_set());
	}

}
