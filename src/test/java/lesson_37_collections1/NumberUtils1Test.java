package lesson_37_collections1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtils1Test {

    @Test
    void shouldReturnCorrectResultWhenFirstOrderedIsCalled() {
        // given
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(6);
        myList.add(2);

        // when
        List<Integer> result1 = NumberUtils1.firstOrdered(myList);
        // then
        Assertions.assertEquals(2, 4, result1.size());

    }

    @Test
    void shouldCorrectlyMergeMapsWhenMergeMapsIsCalled() {
        // given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 5);
        map1.put("b", 6);
        Map<String, Integer> map2 = new HashMap<>( );
        map2.put("b", 6);
        map2.put("c", 4);
        // when
        Map<String, Integer> result = NumberUtils1.mergeMaps(map1, map2);
        // then
      assertEquals(3,result.size());
    }
}