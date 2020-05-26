package com.sai.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class One_IntroductionToMaps {

    //  Map Interface <- - Implements - - HashMap  <--Extends-- LinkedHashMap
    //          ^
    //          |---Extends-- SortedMap <- -Implements - - TreeMap
    //
    //
    // Map is an interface that extends Collection interface which is used to store key-value type of information.
    //  Unique features:
    //                  - Cannot store duplicate keys, also each key can store at most one value element
    //                  - null keys and null values are allowed in HashMao and LinkedHashmap but not in TreeMap
    //                  - the order if items can be known in LinkedHashmap or TreeMap but not HashMap

    //Supported operations:
    //  <v> put(<k>, <v>)   - insert one pair of key and value
    //  putAll(<map>)   - insert all values of map into another
    //  void remove(<k>)     - delete an entry form map, the key and values are deleted from map
    //  <v> get(<k>)    - returns the specific value inserted along with the key
    //  <bool> containsKey(<k>) - test to find a specific key in map
    //  Set<k> keySet()        - returns Set of all keys from the map
    //  Set<Map.Entry<k, v>> entrySet()      - returns the Set of view containing keys and values
    //  getOrDefault(<k>, <d_v>)    - returns the value when the key exists else just returns default value

    //along with this it also supports the following methods: size(),

    public static void introHashMap() {
        //declaration
        Map<Integer, String> hashMap = new HashMap<>();
        //put
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        printHashMap(hashMap);
        //get
        System.out.println("Value of key 2: " + hashMap.get(2));

        Map<Integer, String> newHashMap = new HashMap<>(hashMap);
        //newHashMap.putAll(hashMap);  constructor or this
        printHashMap(newHashMap);

        System.out.println("Does the map contain key 2: " + newHashMap.containsKey(2));
        System.out.println("Removing key 2 from map.. ");
        newHashMap.remove(2);
        printHashMap(newHashMap);
        System.out.println("Iterate list using entrySet");
        for(Map.Entry<Integer, String> pair: newHashMap.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println("Fetching non existing key by passing default value DEFAULT ::" +
                newHashMap.getOrDefault(100,"DEFAULT"));
    }

    private  static void printHashMap(Map<Integer, String> map) {
        System.out.println("Map Values: ");
        for(int key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
