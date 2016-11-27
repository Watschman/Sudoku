package main.java.com.watschman.sudoku;

import main.java.com.watschman.sudoku.test.TestKlasse;
import main.java.com.watschman.sudoku.utility.LogHelper;

import java.awt.*;
import java.io.Console;
import java.io.IOException;
import java.net.URISyntaxException;

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
/*
  --> Wird zum Debuggen des Endprodukts benötigt

    public static void main(String[] args)throws IOException, InterruptedException, URISyntaxException{
        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = Sudoku.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            Sudoku.run(new String[0]);
            LogHelper.info("Program has ended, please type 'exit' to close the console");
        }
    }
    public static void run(String[] args) {
        new Sudoku();
    }
    */
    public static void main(String[] args){
        new Sudoku();
    }
}
