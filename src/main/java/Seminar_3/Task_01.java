package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(-100, 100);
            list.add(value);
        }
        System.out.printf("Произвольный список %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел %s", list);
    }
}
