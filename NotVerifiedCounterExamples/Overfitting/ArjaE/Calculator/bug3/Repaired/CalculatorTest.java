package ArjaE.Calculator.bug3.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		int num1 = -2147483647;
		int num2 = 0;
		char operator = '+';
		Calculator calculator = new Calculator();
		assertEquals(num1+num2, calculator.calculate(num1, num2, operator));
	}
	
	@Test
	void test0() {
		int num1 = -2147483647;
		int num2 = 0;
		char operator = '.';
		Calculator calculator = new Calculator();
		assertEquals(-1, calculator.calculate(num1, num2, operator));
	}
	
	@Test
	void test1() {
		int num1 = -2147483647;
		int num2 = 0;
		char operator = '-';
		Calculator calculator = new Calculator();
		assertEquals(num1-num2, calculator.calculate(num1, num2, operator));
	}

}
