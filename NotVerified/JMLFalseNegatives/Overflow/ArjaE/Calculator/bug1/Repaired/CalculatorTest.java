
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
	@Test
	void test() {
		int num1 = -2147483647;
		int num2 = 2;
		char operator = '+';
		assertEquals(new Calculator().calculate(num1, num2, operator), num1+num2);
	}
	
	@Test
	void test1() {
		int num1 = 1;
		int num2 = -2147483647;
		char operator = '+';
		assertEquals(new Calculator().calculate(num1, num2, operator), num1+num2);
	}

}
