import static org.junit.Assert.*;

import org.junit.Test;

public class StudentEnrollmentTest {
    
    @Test
    public void test() {
        int enrollmentCredits = 20;
        int tuitionBalance = -2147481211;
        int newTuitionBalance = 4241;
        StudentEnrollment enrollment = new StudentEnrollment("", "");
        enrollment.setEnrollmentCredits(enrollmentCredits);
        enrollment.setTuitionBalance(tuitionBalance);

        assertThrows(IllegalArgumentException.class, () -> {
            enrollment.setTuitionBalance(newTuitionBalance);
        });

        assertEquals(tuitionBalance, enrollment.getTuition());
    }

    @Test
    public void test0() {
        int enrollmentCredits = 0;
        int tuitionBalance = -2147481211;
        int newTuitionBalance = 4241;
        StudentEnrollment enrollment = new StudentEnrollment("", "");
        enrollment.setEnrollmentCredits(enrollmentCredits);
        enrollment.setTuitionBalance(tuitionBalance);

        assertThrows(IllegalArgumentException.class, () -> {
            enrollment.setTuitionBalance(newTuitionBalance);
        });

        assertEquals(tuitionBalance, enrollment.getTuition());
    }

    @Test
    public void test1() {
        int enrollmentCredits = 1;
        int tuitionBalance = -2147476722;
        int newTuitionBalance = 4241;
        StudentEnrollment enrollment = new StudentEnrollment("", "");
        enrollment.setEnrollmentCredits(enrollmentCredits);
        enrollment.setTuitionBalance(tuitionBalance);

        assertThrows(IllegalArgumentException.class, () -> {
            enrollment.setTuitionBalance(newTuitionBalance);
        });

        assertEquals(tuitionBalance, enrollment.getTuition());
    }

    @Test
    public void test2() {
        int enrollmentCredits = 17;
        int tuitionBalance = 1;
        int newTuitionBalance = 4240;
        StudentEnrollment enrollment = new StudentEnrollment("", "");
        enrollment.setEnrollmentCredits(enrollmentCredits);
        enrollment.setTuitionBalance(tuitionBalance);

        enrollment.setTuitionBalance(newTuitionBalance);
        assertEquals(tuitionBalance, enrollment.getTuition());
    }

}
