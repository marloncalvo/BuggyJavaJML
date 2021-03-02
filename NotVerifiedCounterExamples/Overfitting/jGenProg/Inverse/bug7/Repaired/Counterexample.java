public class Counterexample {
    public static void main(String[] args) {
        case1();
        case2();
    }

    public static void case1() {
        int size = 7719;
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        arr1[0] = 7719;
        arr2[size-1] = 7719; 
        arr1[1] = -1;

        assert(!Inverse.Inverse(arr1, arr2));
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
