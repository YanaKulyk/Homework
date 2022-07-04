package yana.kulyk.collection;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Cat1> map = createMap();
        for (Map.Entry<String, Cat1> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static Map<String, Cat1> createMap() {
        HashMap<String, Cat1> map = new HashMap<>();
        map.put("Murka", new Cat1("Murka"));
        map.put("Vaska", new Cat1("Vaska"));
        map.put("Luca", new Cat1("Luca"));
        map.put("Murzik", new Cat1("Murzik"));
        map.put("Rudik", new Cat1("Rudic"));
        map.put("Nora", new Cat1("Nora"));
        map.put("Tom", new Cat1("Tom"));
        map.put("Sonya", new Cat1("Sonya"));
        map.put("Zorro", new Cat1("Zorro"));
        map.put("Rokki", new Cat1("Rokki"));
        return map;


    }
}
