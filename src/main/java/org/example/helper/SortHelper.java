package org.example.helper;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SortHelper {
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map )
    {
        Map<K,V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K,V>> st = map.entrySet().stream();

        st.sorted(Map.Entry.<K, V> comparingByValue().reversed() ).forEach( e -> result.put(e.getKey(), e.getValue()) );

        return result;
    }
}
