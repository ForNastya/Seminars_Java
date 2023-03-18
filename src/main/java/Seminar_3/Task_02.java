package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        numbersArrayList();
    }

    private static void numbersArrayList() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        int average = sum / arrayList.size();
        System.out.println(arrayList);
        System.out.println("Максимальное значение = " + Collections.max(arrayList));
        System.out.println("Минимальное значение = " + Collections.min(arrayList));
        System.out.println("Среднее значение = " + average);
    }
}
