public class Counterexample {
    public static void main(String[] args) {
        int [] arr = {1};
        FindInArray fia = new FindInArray(arr);
        fia.setKey(1);

        assert(!fia.isMoreThanOneKey());
    }
}
