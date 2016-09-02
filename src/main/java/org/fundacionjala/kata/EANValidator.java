package org.fundacionjala.kata;

/**
 * Class to Validate EAN number
 */
public class EANValidator {

    public static boolean validate(String number) {
        int checksum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            checksum += ((i + 1) % 2 == 0) ? Character.getNumericValue(number.charAt(i)) * 3 : Character.getNumericValue(number.charAt(i)) * 1;
        }
        checksum = checksum % 10 == 0 ? 0 : 10 - (checksum % 10);
        return Character.getNumericValue(number.charAt(number.length() - 1)) == checksum;
    }
}
