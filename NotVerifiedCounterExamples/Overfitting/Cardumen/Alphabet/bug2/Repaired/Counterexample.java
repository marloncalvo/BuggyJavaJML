public class Counterexample {

    public static void main(String [] args) {
        Alphabet alphabet = new Alphabet('B');
        assert(!alphabet.isVowel());
    }
}
