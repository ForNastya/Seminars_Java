package Seminar_1;

public class Main {
    //Task_01
    public static void main(String[] args) {
        findMaxMin();
    }

    private static void findMaxMin() {
        int numbers[] = new int[]{21, 7, 11, 3, 9, 19, 4};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            else if (numbers[i] < min) min = numbers[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

