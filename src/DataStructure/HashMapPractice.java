package DataStructure;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"치즈케이크");
        map1.put(2,"BTS");

        HashMap<String, String>map2 = new HashMap<>();
        map2.put("bts","jimin");

        System.out.println(map1.get(1));
        System.out.println(map2.get("bts"));
    }
}
