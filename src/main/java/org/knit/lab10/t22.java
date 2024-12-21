package org.knit.lab10;
import java.util.HashMap;
import java.util.Map;

class Dictionary<K, V> {
    private Map<K, V> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public V remove(K key) {
        return map.remove(key);
    }
}
public class t22 {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        System.out.println(dictionary.get("Alice")); // 25
    }
}