package com.sai.datastructures.declaringtypes;

import java.util.HashMap;
import java.util.Map;

public class IntroDeclaringObjectTypes {

    public static void declaringObjectTypes() {
        Map store = new HashMap<Integer, Integer>();
        store.put(1, 10);
        //int value =  store.get(1); this cannot be done as Map doesn't grantee an object type
        Map store2 = new HashMap<Integer, String>();
        store2.put(1, "value");
        //String value = store2.get(1);   even the object value will not work not just primitives types


        //instead do this
        Map<Integer, Integer> store3 = new HashMap<>();
        store3.put(1, 10);
        int value = store3.get(1);
    }
}
