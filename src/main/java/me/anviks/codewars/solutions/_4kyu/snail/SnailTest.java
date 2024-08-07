/*
 * https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1
 */

package me.anviks.codewars.solutions._4kyu.snail;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class SnailTest {

    @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals(result, Snail.snail(array));
    }


}
