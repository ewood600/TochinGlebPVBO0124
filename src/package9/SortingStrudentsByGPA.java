package package9;

import java.util.ArrayList;

public class SortingStrudentsByGPA {
    public static void quicksort(ArrayList<Student> iDNumber, int field) {
        quicksort(0, iDNumber.size() - 1, iDNumber, field);
    }

    private static void quicksort(int low, int high, ArrayList<Student> iDNumber, int field) {
        if (low < high) {
            int pi = partition(low, high, iDNumber, field);
            quicksort(low, pi - 1, iDNumber, field);
            quicksort(pi + 1, high, iDNumber, field);
        }
    }

    private static int partition(int low, int high, ArrayList<Student> iDNumber, int field) {
        GPAComparator g = new GPAComparator();
        Student pivot = iDNumber.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (g.compare(pivot, iDNumber.get(j)) == -1) {
                i++;
                Student temp = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, temp);
            }
        }

        Student temp = iDNumber.get(i + 1);
        iDNumber.set(i + 1, iDNumber.get(high));
        iDNumber.set(high, temp);

        return i + 1;
    }
}
