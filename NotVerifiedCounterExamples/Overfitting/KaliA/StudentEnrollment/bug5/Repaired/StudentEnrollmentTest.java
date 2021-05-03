package KaliA.StudentEnrollment.bug5.Repaired;

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
        se.setEnrollmentCredits(16);
        se.setTuitionBalance(-2147474793);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.setPassedCredits(121);
        });
    }

	@Test
    void case2() {
        se.setEnrollmentCredits(6);
        se.setTuitionBalance(-2147482325);

        assertThrows(IllegalArgumentException.class, () -> {
        	se.setPassedCredits(121);
        });
    }
	
}
