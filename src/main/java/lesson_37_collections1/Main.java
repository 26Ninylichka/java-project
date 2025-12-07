package lesson_37_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {

        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(2);
        myList.add(4);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println(NumberUtils1.firstOrdered(myList));


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 3);
        map1.put("c", 4);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 2);
        map2.put("c", 3);
        System.out.println(NumberUtils1.mergeMaps(map1, map2));


    }

}
