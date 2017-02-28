package main.java.com.watschman.sudoku.berechnungsAlgorithmus;

import main.java.com.watschman.sudoku.reference.Reference;
import main.java.com.watschman.sudoku.utility.LogHelper;

public class BerechnungsAlgorithmusCore {
    public BerechnungsAlgorithmusCore(){
    }

    public static void compareSolutions(int[] solutionsToCompare, String level){
        if (isSolutionCorrect(solutionsToCompare, level)){
            LogHelper.info("Victory, Congratulations!");
        } else {
            LogHelper.info("Something seems to be not quite right yet");
        }
    }
    public static boolean isSolutionCorrect(int[] solutionsToCompare, String level){
        int k = 0;
        for (int i = 0; i < solutionsToCompare.length; i++){
            switch (level){
                case "Level 1":
                    if (solutionsToCompare[i] == Reference.LEVEL_1_SOLUTION[i])
                        k++;
                    break;
                case "Level 2":
                    if (solutionsToCompare[i] == Reference.LEVEL_2_SOLUTION[i])
                        k++;
                    break;
                case "Level 3":
                    if (solutionsToCompare[i] == Reference.LEVEL_3_SOLUTION[i])
                        k++;
                    break;
            }
        }
        return k == 81;
    }
}
