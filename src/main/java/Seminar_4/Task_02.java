package Seminar_4;

import java.util.LinkedList;

public class Task_02 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            link.add(randomEl());
        }
        System.out.println(link);

        for (int i = 0; i < 10; i++) {
            System.out.print(link.getLast() + ", ");
            link.removeLast();

        }
    }

    public static int randomEl() {
        double x = (Math.random() * 100);
        int number = (int) x;
        return number;
    }
}
