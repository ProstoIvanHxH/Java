package org.knit.lab10;

import java.util.*;

public class Pair {
    // Return a map entry (key-value pair) from the specified values
    public static <T, U> Map.Entry<T, U> of(T first, U second) {
        return new AbstractMap.SimpleEntry<>(first, second);
    }

    private Map.Entry entry;

    public Pair (Object x, Object y) {
        Set<Map.Entry> entries = new HashSet<>();
        entries.add(Pair.of(x, y));
        Object[] setArray = entries.toArray();
        this.entry = (Map.Entry) setArray[0];
    }

    pu
    }
}