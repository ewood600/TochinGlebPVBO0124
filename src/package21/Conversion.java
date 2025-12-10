package package21;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        lst.addAll(Arrays.asList(a));
    }
}
