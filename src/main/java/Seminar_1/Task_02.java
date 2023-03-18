package Seminar_1;

public class Task_02 {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int val = 3;
        int[] newArray = new int[array.length];
        int count = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                count++;
            } else {
                newArray[j] = array[i];
                j++;
            }

        }
        for (int n = 0; n < count; n++) {
            newArray[j] = val;
            j++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%d", newArray[i]);
        }
    }
}

