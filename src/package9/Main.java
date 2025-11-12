package package9;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        setArray(3, iDNumber);
        GPAComparator g = new GPAComparator();
        for (int left = 0; left < iDNumber.size(); left++) {
            Student value = iDNumber.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (g.compare(value, iDNumber.get(i)) == 1) {
                    iDNumber.set(i + 1, iDNumber.get(i));
                } else {
                    break;
                }
            }
            iDNumber.set(i + 1, value);
        }
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

