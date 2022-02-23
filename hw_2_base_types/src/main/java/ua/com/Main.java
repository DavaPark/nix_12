package ua.com;

import ua.com.FirstClass.First;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("hw_2_base_types");
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
        System.out.println("Что бы выбрать 1-задачу, нажмите-1");
        System.out.println("Что бы выбрать 2-задачу, нажмите-2");
        System.out.println("Что бы выбрать 3-задачу, нажмите-3");
        System.out.println("Если вы хотите выйти нажмите 0");
    }

    private static void logic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> new First().Strokaschitaet(reader);
            case "2" -> new First().Strokasimvoli(reader);
            case "3" -> new First().lessons(reader);
            case "0" -> System.exit(0);
        }
    }

}
