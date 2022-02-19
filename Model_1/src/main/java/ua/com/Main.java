package ua.com;

import ua.com.SecondTask.Second;
import ua.com.FirstTask.First;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Модуль 1");
        System.out.println("Что бы продолжить нажмите enter:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                navigation();
                logic(reader);
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }


    private static void navigation() {
        System.out.println("Что бы выбрать 1-уровень и 1-задачу, нажмите-1");
        System.out.println("Что бы выбрать 1-уровень и 2-задачу, нажмите-2");
        System.out.println("Что бы выбрать 1-уровень и 3-задачу, нажмите-3");
        System.out.println("Что бы выбрать 2 уровень нажмите 4");
        System.out.println("Что бы выбрать 3 уровень нажмите 5");
        System.out.println("Если вы хотите выйти нажмите 0");
    }

    private static void logic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
            switch (line) {
            case "1" -> new First().FirstLevel(reader);
            case "2" -> new First().SecondLevel(reader);
            case "3" -> new First().ThirdLevel(reader);
            case "4" -> new Second().stroka(reader);
            case "5" -> System.out.println("К сожелению тут ничего нет :(");
            case "0" -> System.exit(0);
        }
    }


}
