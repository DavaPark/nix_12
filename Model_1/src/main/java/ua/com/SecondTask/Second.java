package ua.com.SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {

    private final static ArrayList<String> START_BRACKETS = new ArrayList<>(Arrays.asList("[", "{", "("));
    private final static ArrayList<String> END_BRACKETS = new ArrayList<>(Arrays.asList("]", "}", ")"));

    public static void stroka(BufferedReader reader) throws IOException{
        System.out.println("Введите строку");
        String stroka = reader.readLine();
        System.out.println(isMatch("stroka = " + stroka));

    }

    public static boolean isMatch(String value) {
        var list = new ArrayList<>(Arrays.asList(value.split("")));

        return validate(list);
    }

    private static boolean validate(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (START_BRACKETS.contains(list.get(i))) {
                var toIndex = list.lastIndexOf(findEndBracket(list.get(i)));
                if (toIndex == -1) {
                    return false;
                }
                var sub = list.subList(i + 1, toIndex);
                return validate(sub);
            }
        }
        return true;
    }

    private static String findEndBracket(String start) {
        var index = START_BRACKETS.indexOf(start);
        return END_BRACKETS.get(index);
    }
}
