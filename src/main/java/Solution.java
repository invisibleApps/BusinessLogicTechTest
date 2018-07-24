import factorials.MultiThreadFactorial;

import org.apache.commons.lang3.StringUtils;

import java.util.*;


public class Solution {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factorial`s value. Valid range of value is beetween 0 and " + Integer.MAX_VALUE);
        String stringValue = scanner.next();

        boolean isDigit = StringUtils.isNumeric(stringValue);
        if (isDigit && Long.parseLong(stringValue) <= Integer.MAX_VALUE) {
            int value = Integer.parseInt(stringValue);
            System.out.print(new MultiThreadFactorial().calculate(value));
        } else
            System.err.println("Wrong input. The input value must be is greater than or equal to 0 and must be integer. " +
                    "Max value = " + Integer.MAX_VALUE);

    }

}