package Nopol.Absolute.bug3.Repaired;

public class Counterexample {
    public static void main(String[] args) {
        Absolute abs = new Absolute();
        assert(abs.Absolute(1) == 1);
    }
}
