package com.sai.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapAbout {

    //What is Hashing technique; representing long string in shorter string using one of the hashing technique
    //      Hashing Techniques:
    //Shorter hash-string increases the speed of look-up
    //HashMap doesn't guarantee the order

    //Implementation of HashMap
    // Node structure: hash, key, value and next (next element address)

    //Performance of HashMap
    //Initial Capacity and Load-factor
    //Capacity: the number of buckets that are initially created for hash-map
    //Load-factor the number of elements that are tobe inserted before rehashing is triggered.
    //optimal load-factor is 0.75

    //Synchronized HashMap
    //Map m = Collections.synchronizedMap(new HashMap(...));

    //Constructors
    //HashMap() --> with initial capacity - 16 and load-factor - 0.75
    //HashMap(int initial capacity)  --> with initial capacity - capacity and same load-factor
    //HashMap(int initial capacity, float loadFactor) --> with custom capacity and load-factor
    //HashMap(Map m)  -> constructed with same properties as m

    //Supported operations:
    // void clear() - removes all k-v pairs from HM
    // boolean containsKey(<k>) - returns true if the key exists else false
    // boolean containsValue(<v>) - returns true if the value exists in HM by iterating over all keys
    // boolean isEmpty() - checks if the MP is empty
    // Set<Map.Entry<k, v>> entrySet() - returns Set of pair of key value pairs -- unordered
    // Set<k> keySet() - returns set of keys unordered
    //  <v> put(<k>, <v>) - adds or overrides existing key with the value provided
    // <v> get(k) - fetches the value stored for a key, null if it doesn't exists
    // int size() - returns the size (or) # keys stored in HM
    // <v> remove(<k>) - removes the key and returns the value stored in it
    // Collection values() - returns the list of values stored unordered
    // <v> getOrDefault(<k>, <default-v>) - returns the stored value for a key if present else default values given as i/p
    // <String> replace(<k>, <v>) - replaces key with values provided, returns old value
    // <boolean> replace(<k>, <old-v>, <new-v>) - replaces key with values provided only if the old value is matched.
    //                          returns true if the operation is successful else false.

    public static void demoHashMapUsage() {
        Map<Integer, String> hashMap = new HashMap<>();
        System.out.println("Adding 1 to the list with value: " + hashMap.put(1, "one"));
        System.out.println("Adding 2 to the list with value: " + hashMap.put(2, "two"));
        System.out.println("Clear all keys from HM ");
        hashMap.clear();
        System.out.println("Adding 3 to the list with value: " + hashMap.put(3, "three"));
        System.out.println("Adding 4 to the list with value: " + hashMap.put(4, "four"));
        System.out.println("Check if 2 exists: " + hashMap.containsKey(2));
        System.out.println("Printing all keys and values");
        for(Map.Entry<Integer, String> pair : hashMap.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println();
        System.out.println("Printing all keys of HM");
        for(Integer key : hashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();
        System.out.println("Fetch value of key: 4  value: " + hashMap.get(4));
        System.out.println("Fetch value of key: 2  value: " + hashMap.get(2));
        System.out.println("Size of hashMap: " + hashMap.size());
        System.out.println("Printing all values of HM");
        for(String value : hashMap.values()) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Fetch value of key: 2  value or default it to <doesn't exists> if not available : "
                + hashMap.getOrDefault(2, "<doesn't exists>"));
        System.out.println("Replacing 3 with #three");
        System.out.println("Return value of replace op <old value>: " + hashMap.replace(3, "#three"));
        System.out.println("Fetch value of key: 3  value: " + hashMap.get(3));
        System.out.println("Replacing 4 with #four only if the value if 4");
        System.out.println("Value of 4 after replace op: "  +
                hashMap.replace(4, "4", "#four"));
        System.out.println("Replacing 4 with #four only if the value if four");
        System.out.println("Value of 4 after replace op: "  +
                hashMap.replace(4, "four", "#four"));

    }


}
