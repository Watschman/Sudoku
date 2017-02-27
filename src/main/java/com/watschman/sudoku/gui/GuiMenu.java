package main.java.com.watschman.sudoku.gui;

import main.java.com.watschman.sudoku.utility.LogHelper;

import javax.swing.*;
import java.awt.*;

public class GuiMenu extends JFrame{
    public GuiMenu(String name){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(GuiPanels.START_GAME_PANEL, BorderLayout.NORTH);
        add(GuiPanels.OPTION_PANEL, BorderLayout.CENTER);
        add(GuiPanels.QUIT_PANEL, BorderLayout.SOUTH);
        initializeButton(GuiPanels.START_GAME_PANEL);
        initializeButton(GuiPanels.OPTION_PANEL);
        initializeButton(GuiPanels.QUIT_PANEL);
        setVisible(true);
        pack();
    }
    private void sendQuit(){
        LogHelper.info("quitting Game...");
        dispose();
    }
    private void initializeButton(JButton button){
        button.addActionListener(e -> {
            if (e.getActionCommand().equals(button.getText())){
                try {
                    switch (button.getText()){
                        case "Start Game":
                            add(new GuiGamePanel());
                            GuiPanels.START_GAME_PANEL.setVisible(false);
                            GuiPanels.OPTION_PANEL.setVisible(false);
                            GuiPanels.QUIT_PANEL.setVisible(false);
                            setSize(300,300);
                            break;
                        case "Options":
                            return;
                        case "Quit":
                            sendQuit();
                    }
                }catch (Exception ex){
                    LogHelper.fatal("Exception during operation " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
    }
}
