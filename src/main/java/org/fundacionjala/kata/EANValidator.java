package org.fundacionjala.kata;

/**
 * Created by LourdesVillca on 8/26/2016.
 */
public class EANValidator {

    public static boolean validate(String number) {

        int checksum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            if (((i + 1) % 2) == 0) {
                checksum = checksum + Character.getNumericValue(number.charAt(i)) * 3;

            } else {
                checksum = checksum + Character.getNumericValue(number.charAt(i)) * 1;

            }

        }

        if (checksum % 10 == 0) {
            checksum = 0;
        } else {
            checksum = 10 - (checksum % 10);
        }
        return (Character.getNumericValue(number.charAt(number.length() - 1)) == checksum)? true:false;

    }

}
