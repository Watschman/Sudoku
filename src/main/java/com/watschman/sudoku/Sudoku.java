package main.java.com.watschman.sudoku;

import main.java.com.watschman.sudoku.gui.GuiMenu;
import main.java.com.watschman.sudoku.reference.Reference;

import javax.swing.*;
import java.awt.*;
import java.io.Console;
import java.io.IOException;
import java.net.URISyntaxException;

public class Sudoku {
    Sudoku(){
        new GuiMenu(Reference.PROJECT_NAME);
    }
    public static void main(String[] args)throws IOException, InterruptedException, URISyntaxException {
        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = Sudoku.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            Sudoku.run(new String[0]);
        }
    }
    public static void run(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                new Sudoku();
            }
        });
    }
}
