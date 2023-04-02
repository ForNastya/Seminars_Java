package Seminar_6;

import javax.print.attribute.standard.PrinterInfo;
import java.util.*;

public class Task_01 {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("MacBook", "13 inch", 8, "macOS", "White", 102.365);
        Laptop lp2 = new Laptop("Mi Notebook Air", "16 inch", 8, "Windows 11", "White", 70.320);
        Laptop lp3 = new Laptop("Lenovo IdeaPad Z", "14 inch", 8, "Windows 11", "Black", 55.200);
        Laptop lp4 = new Laptop("Mi Notebook Air", "16 inch", 10, "Windows 11", "Black", 99.000);

        List<Laptop> laptopList = List.of(lp1, lp2, lp3, lp4);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выбрать критерий поиска:\n1 - по цвету\n2 - по модели");
        int searchBy = scannerUser.nextInt();
        Scanner scanSearchUser = new Scanner(System.in);
        System.out.println("Укажите какой(какая) интересует? ");
        String SearchUser = scanSearchUser.nextLine();

        if (searchBy == 1) {
            for (Laptop color : laptopList) {
                if (color.getColor().equalsIgnoreCase(SearchUser)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (searchBy == 2){
            for (Laptop model : laptopList) {
                if (model.getModel().equalsIgnoreCase(SearchUser)) {
                    System.out.println(model.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по модели");
        }

        scannerUser.close();

    }
}