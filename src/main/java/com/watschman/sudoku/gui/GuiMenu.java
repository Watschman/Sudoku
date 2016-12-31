package main.java.com.watschman.sudoku.gui;

import main.java.com.watschman.sudoku.utility.LogHelper;

import javax.swing.*;
import java.awt.*;

public class GuiMenu extends JPanel{
    static JFrame JFRAME;
    public GuiMenu(){
        super(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(GuiPanels.START_GAME_PANEL, BorderLayout.NORTH);
        add(GuiPanels.OPTION_PANEL, BorderLayout.CENTER);
        add(GuiPanels.QUIT_PANEL, BorderLayout.SOUTH);
        initializeButton(GuiPanels.START_GAME_PANEL);
        initializeButton(GuiPanels.OPTION_PANEL);
        initializeButton(GuiPanels.QUIT_PANEL);
    }
    private void sendQuit(){
        LogHelper.info("quitting Game...");
        JFRAME.dispose();
    }
    public static void createGui(String guiName){
        JFRAME = new JFrame(guiName);
        JFRAME.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFRAME.add(new GuiMenu());
        JFRAME.setVisible(true);
        JFRAME.pack();
    }
    private void initializeButton(JButton button){
        button.addActionListener(e -> {
            if (e.getActionCommand().equals(button.getText())){
                try {
                    switch (button.getText()){
                        case "Start Game":
                            GuiGamePanel.createNewGui(JFRAME);
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
