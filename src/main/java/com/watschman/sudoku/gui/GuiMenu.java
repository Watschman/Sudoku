package main.java.com.watschman.sudoku.gui;

import main.java.com.watschman.sudoku.reference.Reference;
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
    protected static void goBack(JComponent[] toDispose){
        for (JComponent i : toDispose)
            i.setVisible(false);
        GuiPanels.START_GAME_PANEL.setVisible(true);
        GuiPanels.OPTION_PANEL.setVisible(true);
        GuiPanels.QUIT_PANEL.setVisible(true);
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
                            GuiPanels.START_GAME_PANEL.setVisible(false);
                            GuiPanels.OPTION_PANEL.setVisible(false);
                            GuiPanels.QUIT_PANEL.setVisible(false);
                            add(new GuiGamePanel());
                            setSize(Reference.GAME_WIDTH,Reference.GAME_HEIGHT);
                            break;
                        case "Choose Level":
                            GuiPanels.START_GAME_PANEL.setVisible(false);
                            GuiPanels.OPTION_PANEL.setVisible(false);
                            GuiPanels.QUIT_PANEL.setVisible(false);
                            add(new GuiLevel());
                            break;
                        case "Quit":
                            sendQuit();
                            break;
                    }
                }catch (Exception ex){
                    LogHelper.fatal("Exception during operation " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
    }
}
