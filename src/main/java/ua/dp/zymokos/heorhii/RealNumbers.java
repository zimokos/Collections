package ua.dp.zymokos.heorhii;

import java.util.ArrayList;

public class RealNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = generateArrayList();
        System.out.print("Коллекция действительных чисел: ");
        printArrayList(list);

        sumNegativeElements(list);

        multiplicationBetweenMinimumMaximum(list);

        multiplicationEvenElements(list);

        sumBetweenFirstLastNegativeElement(list);

        bubbleSort(list);
    }

    public static ArrayList<Integer> generateArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 * (Math.random() > 0.5 ? 1 : -1)));
        }
        return list;
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void sumNegativeElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                sum = sum + list.get(i);
            }
        }
        System.out.println("Сумма отрицательных элементов: " + sum);
    }

    public static void multiplicationBetweenMinimumMaximum(ArrayList<Integer> list) {
        int multi = 1;
        int startRange = 0;
        int endRange = 0;
        if (leftMinimumIndex(list) < rightMaximumIndex(list)) {
            for (int i = leftMinimumIndex(list) + 1; i < rightMaximumIndex(list); i++) {
                if (list.get(i) != 0) {
                    multi = multi * list.get(i);
                }
                startRange = leftMinimumIndex(list);
                endRange = rightMaximumIndex(list);
            }
        } else {
            for (int i = leftMaximumIndex(list) + 1; i < rightMinimumIndex(list); i++) {
                if (list.get(i) != 0) {
                    multi = multi * list.get(i);
                }
                startRange = leftMaximumIndex(list);
                endRange = rightMinimumIndex(list);
            }
        }
        System.out.println("Произведение элементов между минимумом и максимумом: " + multi + " (между " + startRange + " и " + endRange + " элементом)");
    }

    public static int leftMinimumIndex(ArrayList<Integer> list) {
        int leftMinimum = list.get(0);
        int leftMinimumIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (leftMinimum > list.get(i)) {
                leftMinimum = list.get(i);
                leftMinimumIndex = i;
            }
        }
        return leftMinimumIndex;
    }

    public static int rightMinimumIndex(ArrayList<Integer> list) {
        int rightMinimum = list.get(0);
        int rightMinimumIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (rightMinimum >= list.get(i)) {
                rightMinimum = list.get(i);
                rightMinimumIndex = i;
            }
        }
        return rightMinimumIndex;
    }

    public static int leftMaximumIndex(ArrayList<Integer> list) {
        int leftMaximum = list.get(0);
        int leftMaximumIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (leftMaximum < list.get(i)) {
                leftMaximum = list.get(i);
                leftMaximumIndex = i;
            }
        }
        return leftMaximumIndex;
    }

    public static int rightMaximumIndex(ArrayList<Integer> list) {
        int rightMaximum = list.get(0);
        int rightMaximumIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (rightMaximum <= list.get(i)) {
                rightMaximum = list.get(i);
                rightMaximumIndex = i;
            }
        }
        return rightMaximumIndex;
    }

    public static void multiplicationEvenElements(ArrayList<Integer> list) {
        int multi = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) != 0) {
                multi = multi * list.get(i);
            }
        }
        System.out.println("Произведение четных элементов: " + multi);
    }

    public static void sumBetweenFirstLastNegativeElement(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = firstNegativeElement(list) + 1; i < lastNegativeElement(list); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Сумма между первым и последним отрицательным элементом: " + sum);
    }

    public static int firstNegativeElement(ArrayList<Integer> list) {
        int firstNegative = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                firstNegative = i;
                break;
            }
        }
        return firstNegative;
    }

    public static int lastNegativeElement(ArrayList<Integer> list) {
        int lastNegative = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                lastNegative = i;
            }
        }
        return lastNegative;
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    isSorted = false;
                }
            }
        }
        System.out.print("Сортировка пузырьком: ");
        printArrayList(list);
    }
}
