public class Counterexample {
    public static void main(String[] args) {
        // case1();
        case2();
    }

    public static void case1() {
        int size = 7719;
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        arr1[0] = 7719;
        arr2[size-1] = 7719; 

        // buggy case????
        // if you look at trace, it does not show entering loop. so it must
        // have failed the looptest. but index is 0, and array length is
        // ~7k, so it MUST have passed the loop test.
        assert(false);
    }

    public static void case2() {
        int size = 10803;
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        arr1[0] = 11;
        arr2[size-1] = 11; 
        arr1[1] = -1;

        assert(!Inverse.Inverse(arr1, arr2));
    }
}
