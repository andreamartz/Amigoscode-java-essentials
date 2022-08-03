package dev.andreamartz;

import java.util.HashMap;
import java.util.Map;

// maps store key value pairs
public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hannah");
        map.put(2, "Jamil");
        map.put(3, "Alice");
        map.put(3, "Carla");  // overwrites "Alice" with "Carla"

        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.keySet());

        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });

        String defaultV = map.getOrDefault(10, "oops, this is the default value");
        System.out.println(defaultV);
    }
}
