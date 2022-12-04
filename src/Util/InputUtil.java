package Util;

import java.util.Scanner;

public class InputUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputString(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

}