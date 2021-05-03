package Cardumen.Inverse.bug7.Repaired;

public class Inverse {
    //@ ensures !\result ==> ((x.length != y.length) || (\exists int i; 0 <= i && i < x.length; x[i] != y[x.length - 1 -i]));
    //@ ensures \result ==> x.length == y.length && (\forall int i; 0 <= i && i < x.length; x[i] == y[x.length - 1 - i]);
    public static boolean Inverse(int[] x, int[] y) {
        if (x.length != y.length) return false;
        int index = 0;
        //@ maintaining 0 <= index && index <= x.length && x.length == y.length;
        //@ maintaining (\forall int i; 0 <= i && i < index; x[i] == y[x.length -1 - i]);
        //@ decreases x.length - index;
        while (index < x.length) {
            if (x[index] != y[x.length - 1 - index]) {
                return false;
            } else {
               index = x[index];
            }
        }
        return true;
    }
}

// Case 1:
// len  2147481851
// 0: [8855]
// 8855: -1

// Case 2:
// len 8366
// 0: 8276
// 8276: 5484