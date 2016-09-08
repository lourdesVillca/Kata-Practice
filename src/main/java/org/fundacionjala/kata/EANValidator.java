package org.fundacionjala.kata;

/**
 * Class to Validate EAN number
 */
public class EANValidator {

    public static boolean validate(String number) {
        int checksum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            int numberValue = Character.getNumericValue(number.charAt(i));
            checksum += ((i + 1) % 2 == 0) ? numberValue * 3 : numberValue;
        }
        checksum = checksum % 10 == 0 ? 0 : 10 - (checksum % 10);
        final int lastDigit = Character.getNumericValue(number.charAt(number.length() - 1));
        return lastDigit == checksum;
    }
}
