public class Counterexample {
    public static void main(String[] args) {
        int len = 2046;
        int [] x = new int[len];
        int [] y = new int[len];

        x[0] = y[len-1] = 1864;
        x[1846] = y[len-1864-1] = 11;
        x[11] = -1;

        assert(!Inverse.Inverse(x, y));
    }
}

