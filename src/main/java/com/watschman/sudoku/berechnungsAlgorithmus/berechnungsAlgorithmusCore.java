package main.java.com.watschman.sudoku.berechnungsAlgorithmus;

import main.java.com.watschman.sudoku.utility.LogHelper;

public class berechnungsAlgorithmusCore {
    static int[] USER_SOLUTION;
    public berechnungsAlgorithmusCore(){
    }

    public static void compareSolutions(int[] solutionsToCompare){
        USER_SOLUTION = solutionsToCompare;
        printSolution(USER_SOLUTION);
    }
    private static void printSolution(int[] solution){
        for (int i : solution)
            LogHelper.info(i);
    }
}
