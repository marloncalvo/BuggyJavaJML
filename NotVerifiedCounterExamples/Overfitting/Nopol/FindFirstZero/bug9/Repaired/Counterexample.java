public class Counterexample {
    public static void main(String[] args) {
        int [] arr = new int[1];
        arr[0] = 11;
        assert(FindFirstZero.FindFirstZero(arr) == -1);
    }
}
