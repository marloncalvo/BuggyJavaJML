package KaliA.Time.bug72.Repaired;

public class Counterexample {
    public static void main(String[] args) {

    }

    public static void case1() {
        Time time = new Time(22, 37, 35);
        assert(!time.equals(4));
    }

    public static void case2() {
        Time time = new Time(22, 37, 35);
        assert(!time.equals(null));
    }

    public static void case3() {
        Time time = new Time(14, 1, 31);
        Time start = new Time(15, 28, 45);
        Time end = new Time(15, 28, 45);
        time.timeOptions(start, end, 3);
        assert(time.getHour() == 0 && time.getMinute() == 0 
               && time.getSecond() == 0);
    }
}
