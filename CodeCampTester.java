import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CodeCampTester {

    public static void main(String[] args) {
        final String newline = System.getProperty("line.separator");

        // DELETE THE ABOVE TESTS IN THE VERSION OF THE FILE YOU TURN IN

        // CS314 Students: add tests here.
        // test 1, hamming distance
        int[] h1 = { 1, -2, 3, 4, 5 };
        int[] h2 = { 1,  2, 3, 9, 5 };
        int expected = 2;
        int actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println("Test 1 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 1, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }

        // test 2, hamming distance
        h1 = new int[] { 7, 7, 7, 7 };
        h2 = new int[] { 8, 8, 8, 8 };
        expected = 4;
        actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println(newline + "Test 2 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 2, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 2, hamming distance");
        }

        // test 3, isPermutation
        int[] a = { 1, -2, -2, 3, 3 };
        int[] b = { 3, -2, 1, 3, -2 };
        boolean expectedBool = true;
        boolean actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 3 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 3, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 3, isPermutation");
        }

        // test 4, is Permutation
        a = new int[] { 2, 1, 1 };
        b = new int[] { 2, 2, 1 };
        expectedBool = false;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 4 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 4, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 4, isPermutation");
        }

        // test 5, mostVowels
        String[] arrayOfStrings = { "aeiou", "AEIOU", "bbb" };
        int expectedResult = 0;
        int actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 5 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 5, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 5, mostVowels");
        }

        // test 6, mostVowels
        arrayOfStrings = new String[] { "", "xyz", "oooooo" };
        expectedResult = 2;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 6 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 6, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 16, mostVowels");
        }


        // test 7, sharedBirthdays, simple test
        int pairs = CodeCamp.sharedBirthdays(2, 1);
        System.out.println(newline + "Test 7 shared birthdays: expected: 0, actual: " + pairs);
        int expectedShared = 1;
        if (pairs == expectedShared) {
            System.out.println("passed test 7, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 7, shared birthdays");
        }

        // test 8, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(300, 700);
        System.out.println(newline + "Test 8 shared birthdays: expected: "
                + "a value of 1 or more, actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 8, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 8, shared birthdays");
        }

        // test 9, queensAreSafe
        char[][] board = { { '.', 'q', '.' },
                { '.', '.', '.' },
                { '.', '.', 'q' } };

        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 9 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 9, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 9, queensAreSafe");
        }

        // test 10, queensAreSafe
        board = new char[][] { { 'q', '.', '.', '.' },
                { '.', '.', 'q', '.' },
                { '.', '.', '.', '.' },
                { '.', 'q', '.', 'q' } };
        expectedBool = false;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 10 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 10, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 10, queensAreSafe");
        }

        // test 11, getValueOfMostValuablePlot
        int[][] city = { { -1, -2, -1 },
                { -2, 10, -2 },
                { -1, -2, -1 } };
        expected = 10;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 11 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 11, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 11, getValueOfMostValuablePlot");
        }

        // test 12, getValueOfMostValuablePlot
        city = new int[] [] {{ 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };
        expected = 36;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 12 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 12, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 12, getValueOfMostValuablePlot");
        }
    } // end of main method

    // pre: list != null
    private static int[] intListToArray(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("list parameter may not be null.");
        }
        int[] result = new int[list.size()];
        int arrayIndex = 0;
        for (int x : list) {
            result[arrayIndex++] = x;
        }
        return result;
    }
}