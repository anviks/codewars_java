/*
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */

package me.anviks.codewars.solutions._6kyu.create_phone_number;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] + "-"
                + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
}
