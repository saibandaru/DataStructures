package com.sai.datastructures.strings;

/**
 * This class is used to define basic String related operations
 */
public class One_IntroductionStrings {

    //region: String.compareTo(String)
    public static void stringCompareTo(){
        /*
         * compareTo() method is used to perform natural sorting on string. Natural sorting means the sort order which
         * applies on the object, e.g., lexical order for String, numeric order for Sorting integers, etc.
         */
        String a = "a", b = "b", ab = "ab";
        System.out.println(a + ".compareTo("+ b + ") : " + a.compareTo(b));
        System.out.println(b + ".compareTo("+ a + ") : " + b.compareTo(a));
        //System.out.println(a + ".compareTo("+ a + ") : " + a.compareTo(a));
        System.out.println(ab + ".compareTo("+ a + ") : " + ab.compareTo(a));
        System.out.println(a + ".compareTo("+ ab + ") : " + a.compareTo(ab));
        System.out.println();
    }
    //endregion

    //region: Common String using methods: length, trim, split

    public static void commonStringUtilities() {

        String str = "Hello World!";
        System.out.println("Length of the string \"" + str + "\" is: " + str.length());
        System.out.println();

        String trimStr = "    Hello World!     ";
        System.out.println("Result of trim on  \"" + trimStr + "\" is: \"" + str.trim() +"\"");
        System.out.println();

        String splitSpring = "The grass is green on the other side.";
        String[] splitSpringArray = splitSpring.split(" ");
        System.out.println("Result of split-string on : \"" + splitSpring + "\" is as follows: " );
        for (String word : splitSpringArray){
            System.out.print(" \"" + word + "\"");
        }
        System.out.println();

    }

    //endregion

    //region : Substring

    public static void subStringDemo() {
        System.out.println();
        String str = "Knowledge is divine!";
        System.out.println("Substring of string \"" +
                str + "\" from [0,6) : " + str.substring(0, 6));

        System.out.println("Substring of string \"" +
                str + "\" from [3,~) : " + str.substring(3));

        System.out.println("Substring of string \"" +
                str + "\" from [3,3) : " + str.substring(3,3));

        //StringIndexOutOfBoundsException
        //System.out.println("Substring of string \"" +
        //        str + "\" from [0,6) : " + str.substring(0, str.length() + 1));
    }

    //endregion
}
