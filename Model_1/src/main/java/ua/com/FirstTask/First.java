package ua.com.FirstTask;

import java.io.IOException;
import java.io.BufferedReader;

import static java.lang.Math.*;

public class First {

    public static void FirstLevel(BufferedReader reader) throws IOException {
        System.out.println("Введите строку из символов и цифр");
        String simbols = reader.readLine();
        String[] array = (simbols.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        System.out.println("Цифры из массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(Integer.valueOf(array[i]) + " ");
            a[i] = Integer.valueOf(array[i]);
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        System.out.println("\nУНИКАЛЬНЫХ ЧИСЕЛ " + count);

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public static void SecondLevel(BufferedReader reader) throws IOException {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        boolean ch = true;
        while (ch) {
            System.out.println("Введите коородинаты начала:");
            String XStart = reader.readLine();
            char[] ArrX1 = XStart.toCharArray();
            String YStart = reader.readLine();
            char[] ArrY1 = YStart.toCharArray();
            int XStart1;
            int YStart1;
            int HodXint;
            int HodYint;
            System.out.println("Введите координаты хода:");
            String HodX = reader.readLine();
            char[] ArrX = HodX.toCharArray();
            String HodY = reader.readLine();
            char[] ArrY = HodY.toCharArray();
            XStart1 = Character.getNumericValue(ArrX1[0]);
            YStart1 = Character.getNumericValue(ArrY1[0]);
            HodXint = Character.getNumericValue(ArrX[0]);
            HodYint = Character.getNumericValue(ArrY[0]);

            if (abs(XStart1 - HodXint) == 1 && abs(YStart1 - HodYint) == 2 || abs(XStart1 - HodXint) == 2 && abs(YStart1 - HodYint) == 1) {
                System.out.println("вы выиграли");
            } else {
                System.out.println("вы проиграли");
            }

            System.out.println("Если вы хотите сыграть ещё раз нажмите-1, если нет нажмите-0");
            ch = false;
            String line = reader.readLine();
            switch (line) {
                case "1" -> SecondLevel(reader);
                case "0" -> ch = false;
                default -> System.out.println("Вы нажали не то что надо");
            }
        }
    }

    public static void ThirdLevel(BufferedReader reader) throws IOException {

        System.out.println("Введите координаты {x,y} точки A");
        double x1 = Integer.parseInt(reader.readLine());
        double y1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты {x,y} точки B");
        double x2 = Integer.parseInt(reader.readLine());
        double y2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты {x,y} точки С");
        double x3 = Integer.parseInt(reader.readLine());
        double y3 = Integer.parseInt(reader.readLine());
        double square = abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) * 0.5;
        System.out.println("square = " + square);
    }
}
