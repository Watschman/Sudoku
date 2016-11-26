package main.java.com.watschman.sudoku;

import main.java.com.watschman.sudoku.test.TestKlasse;

/**
 * Created by Steve on 26.11.2016.

 --> Das ist unsere Hauptklasse zum Ausführen lediglich eine Instanz der erstellten eigenen Klasse hinzufügen siehe Testklasse.java

 --> Dies muss die einzige Klasse mit dem Wrapper public static void main(String[] args) sein!

 */
public class Sudoku {
    Sudoku(){

        //So fügt ihr eine Klasse zum Ausführen in der Hauptklasse hinzu.
        TestKlasse testKlasse = new TestKlasse();
    }

    public static void main(String[] args){
        new Sudoku();
    }
}
