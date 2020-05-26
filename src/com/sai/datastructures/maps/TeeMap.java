package com.sai.datastructures.maps;

public class TeeMap {

    /*
    * The TreeMap in Java is used to implement Map interface and NavigableMap along with the Abstract Class. The map is
    * sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending
    * on which constructor is used.
    *
    *
    * TreeMap in Java does not allow null keys
    *
    * Declaration and Constructor:
    * TreeMap<key-type, value-type> tm = new TreeMap<>();
    * TreeMap<key-type, value-type> tm = new TreeMap<>(Comparator comp);
    * TreeMap<key-type, value-type> tm = new TreeMap<>(Map map);
    * TreeMap<key-type, value-type> tm = new TreeMap<>(SortedMap map);
    *
    * Supported Operations:
    * +all hash-map
    * Object firstKey() -- the first lowest key stored in TreeMap
    * Object lastKey()  -- returns the highest key stored
    * SortedMap subMap(K startKey, K endKey) -- returns portion of map that in [start, end] range
     */


    /*
    * Definition of Comparator
    * class UserDefined implements Comparator<UserDefinedType> {
    *   public int compare(UserDefinedType val1, UserDefinedType val2) {
    *       return val1 - val2;  //ascending order
    *   }
    * }
     */
}
