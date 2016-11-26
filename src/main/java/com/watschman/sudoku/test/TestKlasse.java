package main.java.com.watschman.sudoku.test;

import main.java.com.watschman.sudoku.reference.Reference;
import main.java.com.watschman.sudoku.utility.LogHelper;

/**
 * Created by Steve on 26.11.2016.
 */
public class TestKlasse {
    public TestKlasse(){
        LogHelper.info("Ich bin eine Testklasse. Hallo Welt!");
        LogHelper.error("Ich bin eine Testklasse in dem Projekt " + Reference.PROJECT_NAME);
        LogHelper.warn("Ich bin eine Testklasse in dem Paket " + getClass().getPackage());
    }
}
