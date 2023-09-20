package res2;

import java.util.HashMap;
import java.util.Map;

public class Inspection {
    public static Map<String, Integer> list = new HashMap<String, Integer>();

    public static void InitList(){
        list.put("Артём", -90);
        list.put("Влад", 140);
        list.put("Сергей", -5);
        list.put("Степан", 0);
    }

    public static int getValue(String name) {
        return list.getOrDefault(name, -999);
    }
}
