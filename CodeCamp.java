//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 *
 *  Replace <NAME> with your name.
 *
 *  On my honor, Divya Madabusi, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name: Divya Madabusi
 *  email address: djm5892@my.utexas.edu
 *  UTEID: djm5892
 *  Section 5 digit ID: 54620
 *  Number of slip days used on this assignment: 0
 */
public class CodeCamp {
    //constants
    public static final int NUM_EXPERIMENTS_1 = 1000000;
    public static final int NUM_EXPERIMENTS_2 = 50000;
    public static final int NUM_BIRTHDAY_PEOPLE = 182;
    public static final int DAYS_IN_YEAR = 365;
    public static final int MAX_PEOPLE = 100;

    /**
     * Determine the Hamming distance between two arrays of ints.
     * Neither the parameter <tt>aData</tt> or
     * <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null, aData.length == aData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }

        int count = 0;
        for( int i = 0; i < aData.length; i++) {
            if(aData[i] != bData[i])
                count++;
        }

        return count;
    }

    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter <tt>aData</tt> or
     * the parameter <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null
     * @param bData != null
     * @return <tt>true</tt> if aData is a permutation of bData,
     * <tt>false</tt> otherwise
     *
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }
        if (aData.length != bData.length) {
            return false;
        }
        int len = aData.length;
        // for each element in aData, check counts in both arrays
        for (int i = 0; i < len; i++) {
            int check = aData[i];
            // count occurrences in aData
            int countA = 0;
            for (int j = 0; j < len; j++) {
                if (aData[j] == check) {
                    countA++;
                }
            }
            // count occurrences in bData
            int countB = 0;
            for (int j = 0; j < len; j++) {
                if (bData[j] == check) {
                    countB++;
                }
            }
            //if frequency differs, not a permutation
            if (countA != countB) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determine the index of the String that
     * has the largest number of vowels.
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o',
     * 'U', and 'u'</tt>.
     * The parameter <tt>arrayOfStrings</tt> is not altered as a result of this method.
     * <p>pre: <tt>arrayOfStrings != null</tt>, <tt>arrayOfStrings.length > 0</tt>,
     * there is an least 1 non null element in arrayOfStrings.
     * <p>post: return the index of the non-null element in arrayOfStrings that has the
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero.
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.<br>
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has
     * the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0
                || !atLeastOneNonNull(arrayOfStrings)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }
        int longestIndex = -1;
        int max = -1;
        int count = 0;
        for(int i = 0; i < arrayOfStrings.length; i++){
            if(arrayOfStrings[i] != null){
                //check for vowels and increment if found
                for(int idx = 0; idx < arrayOfStrings[i].length(); idx++){
                    if(arrayOfStrings[i].substring(idx, idx + 1).equalsIgnoreCase("a") ||
                            arrayOfStrings[i].substring(idx, idx + 1).equalsIgnoreCase("e") ||
                            arrayOfStrings[i].substring(idx, idx + 1).equalsIgnoreCase("i") ||
                            arrayOfStrings[i].substring(idx, idx + 1).equalsIgnoreCase("o") ||
                            arrayOfStrings[i].substring(idx, idx + 1).equalsIgnoreCase("u")) {
                        count++;
                    }
                }
                //determine max
                if(count > max) {
                    longestIndex = i;
                    max = count;
                }
                count = 0;
            }
        }
        return longestIndex;
    }

    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people.
     * Return the number of pairs of people that share the
     * same birthday.<br>
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday
     * after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople +
                    ", numDaysInYear: " + numDaysInYear);
        }
        int pairs = 0;
        //array of days, used to store number of people with each birthday
        int[] days = new int[numDaysInYear];
        for(int i = 0; i < numPeople; i++){
            //generate a random birthday for each person
            int rand = (int) (Math.random() * numDaysInYear);
            // add the number of people who already have this birthday to the pairs counter
            // and increase the number of pairs
            pairs += days[rand];
            days[rand] += 1;
        }
        return pairs;
    }

    /**
     * Determine if the chess board represented by board is a safe set up.
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter <tt>board</tt> is not altered as a result of
     * this method.<br>
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board)
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");
        }
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == 'q'){
                    //check top
                    int r = row - 1;
                    int c = col;
                    while(r >= 0 &&  c >= 0) {
                        if (board[r][c] == 'q') {
                            return false;
                        }
                        r--;
                    }
                    //check right
                    r = row;
                    c = col + 1;
                    while(c < board[0].length) {
                        if (board[r][c] == 'q') {
                            return false;
                        }
                        c++;
                    }
                    //check diagonals
                    boolean check = checkDiagonals(row, col, board);
                    if(!check){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Checks each direction whenever encountering a queen to determine if the queen is
     * safe or not
     * pre: row >= 0, col >= 0, board != null, board is a rectangular matrix, all elements of board == 'q' or '.'.
     * @param row the row the queen is found
     * @param col the column the queen is found
     * @param board the board on which the queens are held
     * @return true if the queen is safe or false if not
     */
    private static boolean checkDiagonals(int row, int col, char[][] board){
        //check preconditions
        char[] validChars = {'q', '.'};
        if( row < 0 || col < 0 || board == null || !isSquare(board) ||
                !onlyContains(board, validChars)){
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The row and column value must be >= 0, " +
                    "the board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");
        }
        //check top left diagonal
        int r = row - 1;
        int c = col - 1;
        while(r >= 0 &&  c >= 0){
            if(board[r][c] == 'q'){
                return false;
            }
            r--;
            c--;
        }
        //check top right diagonal
        r = row - 1;
        c = col + 1;
        while(r >= 0 &&  c < board[0].length) {
            if (board[r][c] == 'q') {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    /**
     * Given a 2D array of ints return the value of the
     * most valuable contiguous sub rectangle in the 2D array.
     * The sub rectangle must be at least 1 by 1.
     * <p>pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
     * mat</tt> is a rectangular matrix.
     * <p>post: return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.<br>
     * @param city The 2D array of ints representing the value of
     * each block in a portion of a city.
     * @return return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.
     */
    public static int getValueOfMostValuablePlot(int[][] city) {
        // check preconditions
        if (city == null || city.length == 0 || city[0].length == 0
                || !isRectangular(city) ) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "getValueOfMostValuablePlot. The parameter may not be null," +
                    " must value at least one row and at least" +
                    " one column, and must be rectangular.");
        }
        int max = city[0][0];
        int check = 0;
        //generate coords for all possible upper left corners
        for(int row = 0; row < city.length; row++){
            for(int col = 0; col < city[0].length; col++){
                //generate each bottom right corner
                for(int r = row; r < city.length; r++){
                    for(int c = col; c < city[0].length; c++){
                        //check each subplot using top left and bottom right coords
                        for(int subRow = row; subRow <= r; subRow++){
                            for(int subCol = col; subCol <= c; subCol++){
                                check += city[subRow][subCol];
                                if(check > max){
                                    max = check;
                                }
                            }
                        }
                        //reset check between subplots
                        check = 0;
                    }
                }
            }
        }
        return max;
    }

    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    // CS314 STUDENTS: Put your birthday problem experiment code here:
    /**
     * Perform 1,000,000 experiments to find the average number of pairs of people with shared
     * birthdays based on a certain number of people in a group and a certain number of days
     * in a year.
     * @return the average number of pairs of people with the same birthdays
     */
    public static int birthdayExperiment1(){
        int sum = 0;
        //simulate 1,000,000 experiments
        for(int i = 0; i < NUM_EXPERIMENTS_1; i++){
            int pairs = sharedBirthdays(NUM_BIRTHDAY_PEOPLE, DAYS_IN_YEAR);
            sum += pairs;
        }
        //calculate average number of pairs
        int avg = (sum) / NUM_EXPERIMENTS_1;
        return avg;
    }

    /**
     * Perform 50,000 experiments to find the number of shared birthdays in groups of varying
     * numbers from 2 to 100 and determine the percentage of experiments where at least one
     * pair of people shared a birthday.
     */
    public static void birthdayExperiment2(){
        //run 50,000 experiments with varying number of people each time
        for(int numPpl = 2; numPpl <= MAX_PEOPLE; numPpl ++){
            int sum = 0;
            for(int i = 0; i < NUM_EXPERIMENTS_2; i++) {
                int pairs = sharedBirthdays(numPpl, NUM_BIRTHDAY_PEOPLE);
                if(pairs > 0)
                    sum++;
            }
            //calculate percentage of pairs for each group of people
            double percentage = sum/(double)NUM_EXPERIMENTS_2;
            System.out.printf(("Num people: %3d, number of experiments with one or more" +
                    " shared birthday: %5d, percentage: %.2f"),numPpl, sum, percentage);
            System.out.println();
        }
    }

    /*
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is
     * not null, otherwise return false.
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < arrayOfStrings.length ) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }


    /*
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < numRows) {
            isSquare = ( mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }


    /*
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while(onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }


    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while(correct && row < mat.length) {
            correct = (mat[row] != null)
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of CodeCamp can not be created
    private CodeCamp() {

    }
}