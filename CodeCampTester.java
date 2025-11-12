import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// CodeCamp.java - CS314 Assignment 1 - Tester class

/*
 * Student information for assignment:
 * Name: Divya Madabusi
 * email address: djm5892@my.utexas.edu
 * UTEID: djm5892
 * Section 5 digit ID: 54620
 * Number of slip days used on this assignment: 0
 */

/*
 * Shared Birthday Experiment 1 Average: 45
 * Question 1: I think it would take 183 people so there is a 50% chance that at least 2 have a shared birthday.
 * Questions 2-4: The percentage first exceeds 50% at 23 people. This surprises me, as I believed the number of
 * people would be much closer to 50% the number of days that there are in a year. This number is much smaller
 * than my predicted answer by 160 people.
 *
 * Shared Birthdays Experiment 2:
 * Num people:   2, number of experiments with one or more shared birthday:   132 percentage: 0.00
 * Num people:   3, number of experiments with one or more shared birthday:   415 percentage: 0.01
 * Num people:   4, number of experiments with one or more shared birthday:   795 percentage: 0.02
 * Num people:   5, number of experiments with one or more shared birthday:  1354 percentage: 0.03
 * Num people:   6, number of experiments with one or more shared birthday:  2080 percentage: 0.04
 * Num people:   7, number of experiments with one or more shared birthday:  2845 percentage: 0.06
 * Num people:   8, number of experiments with one or more shared birthday:  3763 percentage: 0.08
 * Num people:   9, number of experiments with one or more shared birthday:  4818 percentage: 0.10
 * Num people:  10, number of experiments with one or more shared birthday:  5891 percentage: 0.12
 * Num people:  11, number of experiments with one or more shared birthday:  7028 percentage: 0.14
 * Num people:  12, number of experiments with one or more shared birthday:  8508 percentage: 0.17
 * Num people:  13, number of experiments with one or more shared birthday:  9664 percentage: 0.19
 * Num people:  14, number of experiments with one or more shared birthday: 11175 percentage: 0.22
 * Num people:  15, number of experiments with one or more shared birthday: 12669 percentage: 0.25
 * Num people:  16, number of experiments with one or more shared birthday: 14135 percentage: 0.28
 * Num people:  17, number of experiments with one or more shared birthday: 15795 percentage: 0.32
 * Num people:  18, number of experiments with one or more shared birthday: 17542 percentage: 0.35
 * Num people:  19, number of experiments with one or more shared birthday: 19060 percentage: 0.38
 * Num people:  20, number of experiments with one or more shared birthday: 20388 percentage: 0.41
 * Num people:  21, number of experiments with one or more shared birthday: 22293 percentage: 0.45
 * Num people:  22, number of experiments with one or more shared birthday: 23978 percentage: 0.48
 * Num people:  23, number of experiments with one or more shared birthday: 25602 percentage: 0.51
 * Num people:  24, number of experiments with one or more shared birthday: 26990 percentage: 0.54
 * Num people:  25, number of experiments with one or more shared birthday: 28291 percentage: 0.57
 * Num people:  26, number of experiments with one or more shared birthday: 29812 percentage: 0.60
 * Num people:  27, number of experiments with one or more shared birthday: 31257 percentage: 0.63
 * Num people:  28, number of experiments with one or more shared birthday: 32633 percentage: 0.65
 * Num people:  29, number of experiments with one or more shared birthday: 34299 percentage: 0.69
 * Num people:  30, number of experiments with one or more shared birthday: 35208 percentage: 0.70
 * Num people:  31, number of experiments with one or more shared birthday: 36658 percentage: 0.73
 * Num people:  32, number of experiments with one or more shared birthday: 37668 percentage: 0.75
 * Num people:  33, number of experiments with one or more shared birthday: 38820 percentage: 0.78
 * Num people:  34, number of experiments with one or more shared birthday: 39577 percentage: 0.79
 * Num people:  35, number of experiments with one or more shared birthday: 40632 percentage: 0.81
 * Num people:  36, number of experiments with one or more shared birthday: 41612 percentage: 0.83
 * Num people:  37, number of experiments with one or more shared birthday: 42433 percentage: 0.85
 * Num people:  38, number of experiments with one or more shared birthday: 43129 percentage: 0.86
 * Num people:  39, number of experiments with one or more shared birthday: 43987 percentage: 0.88
 * Num people:  40, number of experiments with one or more shared birthday: 44575 percentage: 0.89
 * Num people:  41, number of experiments with one or more shared birthday: 45221 percentage: 0.90
 * Num people:  42, number of experiments with one or more shared birthday: 45663 percentage: 0.91
 * Num people:  43, number of experiments with one or more shared birthday: 46211 percentage: 0.92
 * Num people:  44, number of experiments with one or more shared birthday: 46680 percentage: 0.93
 * Num people:  45, number of experiments with one or more shared birthday: 47050 percentage: 0.94
 * Num people:  46, number of experiments with one or more shared birthday: 47401 percentage: 0.95
 * Num people:  47, number of experiments with one or more shared birthday: 47685 percentage: 0.95
 * Num people:  48, number of experiments with one or more shared birthday: 47972 percentage: 0.96
 * Num people:  49, number of experiments with one or more shared birthday: 48288 percentage: 0.97
 * Num people:  50, number of experiments with one or more shared birthday: 48591 percentage: 0.97
 * Num people:  51, number of experiments with one or more shared birthday: 48721 percentage: 0.97
 * Num people:  52, number of experiments with one or more shared birthday: 48930 percentage: 0.98
 * Num people:  53, number of experiments with one or more shared birthday: 49093 percentage: 0.98
 * Num people:  54, number of experiments with one or more shared birthday: 49226 percentage: 0.98
 * Num people:  55, number of experiments with one or more shared birthday: 49373 percentage: 0.99
 * Num people:  56, number of experiments with one or more shared birthday: 49411 percentage: 0.99
 * Num people:  57, number of experiments with one or more shared birthday: 49509 percentage: 0.99
 * Num people:  58, number of experiments with one or more shared birthday: 49585 percentage: 0.99
 * Num people:  59, number of experiments with one or more shared birthday: 49637 percentage: 0.99
 * Num people:  60, number of experiments with one or more shared birthday: 49701 percentage: 0.99
 * Num people:  61, number of experiments with one or more shared birthday: 49765 percentage: 1.00
 * Num people:  62, number of experiments with one or more shared birthday: 49768 percentage: 1.00
 * Num people:  63, number of experiments with one or more shared birthday: 49821 percentage: 1.00
 * Num people:  64, number of experiments with one or more shared birthday: 49833 percentage: 1.00
 * Num people:  65, number of experiments with one or more shared birthday: 49887 percentage: 1.00
 * Num people:  66, number of experiments with one or more shared birthday: 49903 percentage: 1.00
 * Num people:  67, number of experiments with one or more shared birthday: 49926 percentage: 1.00
 * Num people:  68, number of experiments with one or more shared birthday: 49940 percentage: 1.00
 * Num people:  69, number of experiments with one or more shared birthday: 49953 percentage: 1.00
 * Num people:  70, number of experiments with one or more shared birthday: 49967 percentage: 1.00
 * Num people:  71, number of experiments with one or more shared birthday: 49966 percentage: 1.00
 * Num people:  72, number of experiments with one or more shared birthday: 49973 percentage: 1.00
 * Num people:  73, number of experiments with one or more shared birthday: 49981 percentage: 1.00
 * Num people:  74, number of experiments with one or more shared birthday: 49987 percentage: 1.00
 * Num people:  75, number of experiments with one or more shared birthday: 49989 percentage: 1.00
 * Num people:  76, number of experiments with one or more shared birthday: 49989 percentage: 1.00
 * Num people:  77, number of experiments with one or more shared birthday: 49992 percentage: 1.00
 * Num people:  78, number of experiments with one or more shared birthday: 49994 percentage: 1.00
 * Num people:  79, number of experiments with one or more shared birthday: 49998 percentage: 1.00
 * Num people:  80, number of experiments with one or more shared birthday: 49995 percentage: 1.00
 * Num people:  81, number of experiments with one or more shared birthday: 49995 percentage: 1.00
 * Num people:  82, number of experiments with one or more shared birthday: 49996 percentage: 1.00
 * Num people:  83, number of experiments with one or more shared birthday: 49997 percentage: 1.00
 * Num people:  84, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  85, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  86, number of experiments with one or more shared birthday: 49998 percentage: 1.00
 * Num people:  87, number of experiments with one or more shared birthday: 49999 percentage: 1.00
 * Num people:  88, number of experiments with one or more shared birthday: 49999 percentage: 1.00
 * Num people:  89, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  90, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  91, number of experiments with one or more shared birthday: 49999 percentage: 1.00
 * Num people:  92, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  93, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  94, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  95, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  96, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  97, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  98, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people:  99, number of experiments with one or more shared birthday: 50000 percentage: 1.00
 * Num people: 100, number of experiments with one or more shared birthday: 50000 percentage: 1.00
*/

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