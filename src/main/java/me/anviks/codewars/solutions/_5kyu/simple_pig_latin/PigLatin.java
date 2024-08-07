/*
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */

package me.anviks.codewars.solutions._5kyu.simple_pig_latin;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder pig = new StringBuilder();
        for (String word : str.split(" ")) {
            if ("?!.".contains(word)) {
                pig.append(" ").append(word);
                continue;
            }
            pig.append(" ").append(word.substring(1)).append(word.substring(0, 1)).append("ay");
        }
        return pig.substring(1);
    }
}
