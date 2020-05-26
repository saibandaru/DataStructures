package com.sai.datastructures;

import com.sai.datastructures.comparator.ComparatorArrays;
import com.sai.datastructures.maps.HashMapAbout;
import com.sai.datastructures.maps.One_IntroductionToMaps;
import com.sai.datastructures.overflowbounds.IntegerOverflow;
import com.sai.datastructures.stack.One_IntroductionStack;
import com.sai.datastructures.strings.One_IntroductionStrings;
import com.sai.datastructures.typecasting.IntroTypeCasting;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("This is data structures project!!");
        System.out.println();
        //One_IntroductionStack.stackExample();
        //One_IntroductionToMaps.introHashMap();
        //demoComparatorArrays();
        //demoStrings();
        //demoTypeCasting();
        //demoOverflow();
        demoHashMap();

    }

    //region : Overflow check

    public static void demoOverflow() {
        long value = Integer.MAX_VALUE;
        value+=1;
        System.out.println("Is value: " + value + " contribute to integer overflow: " +
                IntegerOverflow.isAbsIntegerOverFlow(Long.toString(value)));
    }

    //endregion

    //region : Type-casting

    private static void demoTypeCasting() {
        IntroTypeCasting.typeCast();
    }

    //endregion

    //region : Strings
    public static void demoStrings() {
        //using s1.compareTo(s2)
        One_IntroductionStrings.stringCompareTo();
        One_IntroductionStrings.commonStringUtilities();
        One_IntroductionStrings.subStringDemo();
    }
    //endregion

    //region : HashMap
    public static void demoHashMap() {
        HashMapAbout.demoHashMapUsage();
    }
    //endregion

    //region : Arrays comparator
    private static void demoComparatorArrays() {
        Integer[] store = new Integer[]{3,4,1,2,4,6,7,4,5,7,3};
        printArray(store);
        System.out.println("Sort array ascending using comparator : ");
        printArray(ComparatorArrays.sortArrayAscUsingComparator(store));
        System.out.println("Sort array descending using comparator : ");
        printArray(ComparatorArrays.sortArrayDscUsingComparator(store));

    }

    //endregion

    //region : Utility functions

    //region : print array

    private static void printArray(Integer[] array) {
        System.out.print("Array: ");
        for(int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }

    //endregion

    //region print List

    private static void printList(List<Integer> list) {
        System.out.print("List: ");
        for(int val : list) {
            System.out.print(val + " ");
        }
        System.out.println("");
    }

    //endregion

    //endregion
}
