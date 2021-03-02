public class Counterexample {
    public static void main(String[] args) {
        // TODO: Test on another machine
        int size = 2147483647; // too big for my machine, can't run
        int [] arr = new int[size];
        assert(BinarySearch.Binary(arr, 1) == -1);
    }
}
