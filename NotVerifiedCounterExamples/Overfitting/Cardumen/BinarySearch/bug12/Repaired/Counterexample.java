public class Counterexample {
    public static void main(String[] args) {
        int [] arr = new int[]{-1};
        int key = 0;
        assert(BinarySearch.Binary(arr, key) == -1);
    }
}
