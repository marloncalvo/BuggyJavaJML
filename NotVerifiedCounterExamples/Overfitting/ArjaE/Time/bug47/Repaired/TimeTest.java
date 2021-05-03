package ArjaE.Time.bug47.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		fail("The function equals() is not testable for this case");
	}

	@Test
	void test0() {
		Time a = new Time(13, 21, 13);
		Time b = new Time(14, 22, 18);
		assertNotEquals(a, b);
	}

	@Test
	void test1() {
		Time a = new Time(13, 21, 46);
		Time b = new Time(13, 21, 45);
		assertNotEquals(a, b);
	}
	
    @Test
    void test2() {
        fail("The function trustedDifference() is not testable for this case");
    }

}
