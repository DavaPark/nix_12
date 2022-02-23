package ua.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ua.com.FirstClass.First;
import ua.com.SecondClass.Second;
import ua.com.ThirdClass.Third;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello teacher, it is my first homework");
        System.out.println("Please enter");
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
        System.out.println("If you want to see the greeting click the number 1");
        System.out.println("If you press 2 the first library SomeTExt, click the number 2");
        System.out.println("If you press 3 the second library will start all capital letters, click the number 3");
        System.out.println("If you want exit, please enter 0");
    }

    private static void logic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> new First().Hello();
            case "2" -> new Second().JsonObject();
            case "3" -> new Third().UpperCase();
            case "0" -> System.exit(0);
        }
    }
}