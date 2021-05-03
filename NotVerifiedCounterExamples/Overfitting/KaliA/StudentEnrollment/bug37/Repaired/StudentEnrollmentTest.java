package KaliA.StudentEnrollment.bug37.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentEnrollmentTest {

	StudentEnrollment se;
	
	@BeforeEach
	void setUp() throws Exception {
		se = new StudentEnrollment("", "");
	}

	@Test
    void case1() {
        se.setEnrollmentCredits(14);
        se.setTuitionBalance(4240);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.pay(-2147483600, false);
        });
    }

	@Test
    void case2() {
        se.setEnrollmentCredits(2);
        se.setTuitionBalance(-2147483201);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.pay(-2147483600, false);
        });
    }
	
}
