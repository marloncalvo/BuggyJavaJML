public class Counterexample {
    public static void main(String[] args) {
        case1();
    }

    public static void case1() {
        StudentEnrollment se = new StudentEnrollment("", "");
        se.setEnrollmentCredits(14);
        se.setTuitionBalance(4240);

        // assert exception
        se.pay(-2147483600, false);
        assert(false);
    }

    public static void case2() {
        StudentEnrollment se = new StudentEnrollment("", "");
        se.setEnrollmentCredits(2);
        se.setTuitionBalance(-2147483201);

        // assert exception
        se.pay(-2147483600, false);
        assert(false);
    }
}
