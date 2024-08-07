/*
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */

package me.anviks.codewars.solutions._5kyu.simple_pig_latin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
