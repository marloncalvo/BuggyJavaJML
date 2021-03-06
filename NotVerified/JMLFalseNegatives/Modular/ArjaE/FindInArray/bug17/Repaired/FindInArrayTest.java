
import static org.junit.Assert.*;
import org.junit.Test;
public class FindInArrayTest {
	@Test
	void case1() {
		fail("Specification is wrong... "
				+ "for findFirst(), the following line:"
				+ "\n\t//@ maintaining 0 <= index && index <= arr.length;"
				+ "\nshouldbe"
				+ "\n\t//@ maintaining 0 <= index && index < arr.length;");
	}

	@Test
	void case2() {
		int [] array = new int[0];
		int key = -2147481852;
		FindInArray fia = new FindInArray(array, key);
		assertFalse(fia.isMoreThanOneKey());
	}
}
