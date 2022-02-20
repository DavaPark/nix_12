package ua.com.SecondClass;

import org.json.simple.JSONObject;

public class Second {

    public void JsonObject() {
        System.out.println("Second.instance initializer");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Лондон");
        jsonObject.put("main", "Солнечно");
        jsonObject.put("description", "Без осадков");
        System.out.println(jsonObject.toJSONString());
    }
}