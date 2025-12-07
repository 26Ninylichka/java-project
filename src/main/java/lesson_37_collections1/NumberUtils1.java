package lesson_37_collections1;

import java.util.*;

public class NumberUtils1 {

    public static List<Integer> firstOrdered(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> uniqueList = new HashSet<>();

        for (Integer num : numbers) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
                result.add(num);
            }

        }
        return result;
    }


    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);


        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);

            }
        }

        return result;

    }
}
