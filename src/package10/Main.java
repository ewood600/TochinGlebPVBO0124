package package10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        setArray(1, iDNumber);
        quicksort(iDNumber, 1);
        getArray(iDNumber);

    }

    public static void setArray(int i, ArrayList<Student> a) {
        Scanner scanner = new Scanner(System.in);
        while (i > 0) {
            System.out.println("Имя: ");
            String a1 = scanner.nextLine();
            System.out.println("Фамилия: ");
            String a2 = scanner.nextLine();
            System.out.println("Курс: ");
            int a3 = Integer.parseInt(scanner.nextLine());
            System.out.println("Специализация: ");
            String a4 = scanner.nextLine();
            System.out.println("Группа: ");
            String a6 = scanner.nextLine();
            System.out.println("Средний балл: ");
            double a5 = parseDouble(scanner.nextLine());

            a.add(new Student(a1, a2, a3, a4, a6, a5));
            i -= 1;

        }

    }

    public static void getArray(ArrayList<Student> arrayList) {
        for (Student s : arrayList) {
            System.out.println("Имя: " + s.getName());
            System.out.println("Фамилия: " + s.getSecond_name());
            System.out.println("Курс: " + s.getCourse());
            System.out.println("Специализация: " + s.getSpecialization());
            System.out.println("Группа: " + s.getGroup());
            System.out.println("Средний балл: " + s.getGPA());
        }
    }


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
        NameComparator n = new NameComparator();
        Student pivot = iDNumber.get(high);
        int i = (low - 1);

        if (field == 0) {
            for (int j = low; j < high; j++) {
                if (g.compare(pivot, iDNumber.get(j)) == -1) {
                    i++;
                    Student temp = iDNumber.get(i);
                    iDNumber.set(i, iDNumber.get(j));
                    iDNumber.set(j, temp);
                }
            }
        } else if (field == 1) {
            for (int j = low; j < high; j++) {
                if (n.compare(pivot, iDNumber.get(j)) == -1) {
                    i++;
                    Student temp = iDNumber.get(i);
                    iDNumber.set(i, iDNumber.get(j));
                    iDNumber.set(j, temp);
                }
            }
        }

        Student temp = iDNumber.get(i + 1);
        iDNumber.set(i + 1, iDNumber.get(high));
        iDNumber.set(high, temp);

        return i + 1;
    }

    public ArrayList<Student> sortArray(ArrayList<Student> arrayA) { // сортировка Массива который передается в функцию
        if (arrayA == null) {
            return null;
        }
        ArrayList<Student> arrayB;
        if (arrayA.size() < 2) {
            return arrayA;
        }
        arrayB = new ArrayList<>();
        for (int i1 = 0; i1 < arrayA.size() / 2; i1++) {
            arrayB.add(arrayA.get(i1));
        }

        ArrayList<Student> arrayC = new ArrayList<>();
        for (int i1 = arrayA.size() / 2; i1 < arrayA.size(); i1++) {
            arrayC.add(arrayA.get(i1));
        }
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public ArrayList<Student> mergeArray(ArrayList<Student> arrayA, ArrayList<Student> arrayB) {
        ArrayList<Student> arrayC = new ArrayList<>(arrayA.size()+arrayB.size());
        int positionA = 0, positionB = 0;
        GPAComparator g = new GPAComparator();
        for (int i = 0; i < arrayA.size() + arrayB.size(); i++) {
            if (positionA == arrayA.size()) {
                arrayC.set(i, arrayB.get(positionB));
                positionB++;
            } else if (positionB == arrayB.size()) {
                arrayC.set(i, arrayA.get(positionA));
                positionA++;
            } else if (g.compare(arrayA.get(positionA), arrayB.get(positionB)) == 1) {
                arrayC.set(i, arrayA.get(positionA));
                positionA++;
            } else {
                arrayC.set(i, arrayB.get(positionB));
                positionB++;
            }
        }
        return arrayC;
    }

    public ArrayList<Student> merge(ArrayList<Student> arrayA, ArrayList<Student> arrayB) {
        ArrayList<Student> arrayC = new ArrayList<>(arrayA);
        arrayC.addAll(arrayB);
        arrayC = sortArray(arrayC);
        return arrayC;
    }
}

