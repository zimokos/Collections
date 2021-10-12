package ua.dp.zymokos.heorhii;

import java.util.ArrayList;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = generateArrayList();
        System.out.print("Коллекция случайных чисел: ");
        printArrayList(list);

        findMinimum(list);
        findMaximum(list);

        changeOrderElements(list);
        System.out.print("Коллекция с измененным порядком элементов: ");
        printArrayList(list);

        primeNumbers(list);
    }

    public static ArrayList<Integer> generateArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void findMinimum(ArrayList<Integer> list) {
        int listMinimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < listMinimum) {
                listMinimum = list.get(i);
            }
        }
        System.out.print("Минимум в коллекции: " + listMinimum);
        int countListMinimum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == listMinimum) {
                countListMinimum++;
            }
        }
        System.out.println(" (количество: " + countListMinimum + ")");
    }

    public static void findMaximum(ArrayList<Integer> list) {
        int listArrayMaximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > listArrayMaximum) {
                listArrayMaximum = list.get(i);
            }
        }
        System.out.print("Максимум в коллекции: " + listArrayMaximum);
        int countListMaximum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == listArrayMaximum) {
                countListMaximum++;
            }
        }
        System.out.println(" (количество: " + countListMaximum + ")");
    }

    public static ArrayList<Integer> changeOrderElements(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = random.nextInt(i + 1);
            int temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

    public static void primeNumbers(ArrayList<Integer> list) {
        System.out.print("Простые числа в коллекции: ");
        int countPrimeNumbers = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 1; j <= list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(list.get(i) + " ");
                countPrimeNumbers++;
            }
        }
        System.out.println("(количество: " + countPrimeNumbers + ")");
    }
}
