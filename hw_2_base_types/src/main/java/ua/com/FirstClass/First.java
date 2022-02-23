package ua.com.FirstClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class First {
    public static void Strokaschitaet(BufferedReader reader) throws IOException {
        System.out.println("Введите строку из символов и цифр");
        String simbols = reader.readLine();
        String[] array = (simbols.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        System.out.println("Цифры из массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(Integer.valueOf(array[i]) + " ");
            a[i] = Integer.valueOf(array[i]);
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum = " + sum);


    }
    public static void Strokasimvoli(BufferedReader reader) throws IOException {

        String str = reader.readLine();
        char[] CharArray = str.toCharArray();
        List<Character> array = new ArrayList<>();
        for (int i = 0; i < CharArray.length; i++) {
            array.add(CharArray[i]);
        }
        int counter = 1;
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    counter++;
                    array.remove(j);
                    j -= 1;
                }

            }
            System.out.println(array.get(i) + " - " + counter);
            counter = 1;

        }

    }
    public static void lessons(BufferedReader reader) throws IOException{
        System.out.println("Введите урок от 1 до 10");
        int LessonNum =  Integer.parseInt(reader.readLine());
        int hours = (LessonNum * 45 + LessonNum/2 * 5 + ((LessonNum - 1) / 2 + 1) * 15) / 60 + 9;
        int minutes = ((LessonNum * 45 + LessonNum / 2 * 15 + ((LessonNum) / 2) * 5 + (LessonNum % 2 - 1) * 15) % 60);
        System.out.println("Часы " + hours + " минуты " + minutes);
    }

}