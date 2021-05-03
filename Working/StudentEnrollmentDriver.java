public class StudentEnrollmentDriver {
    public static void main(String[] args) {
		int enrollmentCredits = 0;
		int tuitionBalance = 4240;
		int payment = -1;
		StudentEnrollment student = new StudentEnrollment("", "");
		student.setEnrollmentCredits(enrollmentCredits);
		student.setTuitionBalance(tuitionBalance);
		student.pay(payment, false);
		System.out.println(student.getTuition());
    }
}