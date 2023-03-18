package Seminar_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task_02 {
    public static void main(String[] args) {
        String test = "";
        test = "TEST";
        System.out.println(lineTest(test));
        file("C:\\Users\\DinozaurGuGu\\IdeaProjects\\Seminars_Java\\src\\main\\java\\Seminar_2/File.txt");

    }

    private static void file(String s) {
        file(s);
        StringBuilder sb = new StringBuilder();
        for (String fileName : namesArray(s)) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try (PrintWriter pw = new PrintWriter("src\\main\\java\\Seminar_2/File.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String[] namesArray(String s) {
        File dir = new File(s);
        return dir.list();
    }

    private static String lineTest(String test) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            stringBuilder.append(test);
        }

        String result = stringBuilder.toString();

        return result;
    }
}

