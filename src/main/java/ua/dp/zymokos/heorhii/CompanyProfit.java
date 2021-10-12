package ua.dp.zymokos.heorhii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;

public class CompanyProfit {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = profitInput();
        bestMonth(list);
        worstMonth(list);
    }

    public static ArrayList<Integer> profitInput() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите прибыль компании за год (январь-декабрь): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 12; i++) {
            System.out.print(whichMonth(i) + ": ");
            String line = reader.readLine();
            int monthProfit = Integer.parseInt(line);
            list.add(monthProfit);
        }
        return list;
    }

    public static void bestMonth(ArrayList<Integer> list) {
        int bestMonth = list.get(0);
        int bestMonthIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > bestMonth) {
                bestMonth = list.get(i);
                bestMonthIndex = i;
            }
        }
        System.out.println("Лучший месяц в году: " + whichMonth(bestMonthIndex) + ", " + bestMonth + "$");
    }

    public static void worstMonth(ArrayList<Integer> list) {
        int worstMonth = list.get(0);
        int worstMonthIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < worstMonth) {
                worstMonth = list.get(i);
                worstMonthIndex = i;
            }
        }
        System.out.println("Худший месяц в году: " + whichMonth(worstMonthIndex) + ", " + worstMonth + "$");
    }

    public static String whichMonth(int index) {
        String month = "";
        switch (index) {
            case 0:
                month = "январь";
                break;
            case 1:
                month = "февраль";
                break;
            case 2:
                month = "март";
                break;
            case 3:
                month = "апрель";
                break;
            case 4:
                month = "май";
                break;
            case 5:
                month = "июнь";
                break;
            case 6:
                month = "июль";
                break;
            case 7:
                month = "август";
                break;
            case 8:
                month = "сентябрь";
                break;
            case 9:
                month = "октябрь";
                break;
            case 10:
                month = "ноябрь";
                break;
            case 11:
                month = "декабрь";
                break;
        }
        return month;
    }
}
