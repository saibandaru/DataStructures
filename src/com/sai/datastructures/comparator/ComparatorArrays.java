package com.sai.datastructures.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorArrays {

    public static Integer[] sortArrayAscUsingComparator(Integer[] store) {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer one, Integer two) {
                return one - two;
            }
        };
        Arrays.sort(store, comparator);
        return store;
    }

    public static Integer[] sortArrayDscUsingComparator(Integer[] store) {
        Comparator<Integer> comparator = (one, two) -> two - one;
        Arrays.sort(store, comparator);
        return store;
    }

}
