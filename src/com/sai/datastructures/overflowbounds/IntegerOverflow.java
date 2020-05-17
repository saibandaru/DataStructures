package com.sai.datastructures.overflowbounds;

public class IntegerOverflow {

    public static boolean isAbsIntegerOverFlow(String absInteger) {
        int number = 0;
        boolean isNegative = false;
        if (absInteger.charAt(0) == '-') {

        }
        for (char digit : absInteger.toCharArray()) {
            int num = digit - '0';
            if (number > Integer.MAX_VALUE/10 ||
                    (number == Integer.MAX_VALUE/10 &&  (isNegative && num > 8 || (num > 7))))
                return true;
            number = number * 10 + num;
        }
        return false;
    }

}
