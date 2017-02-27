package main.java.com.watschman.sudoku.gui;

import main.java.com.watschman.sudoku.reference.Reference;
import main.java.com.watschman.sudoku.utility.LogHelper;

import javax.swing.*;
import java.awt.*;

public class GuiLevel extends JPanel{
    JComponent[] optionPanels = new JComponent[]{GuiPanels.LEVEL_1_PANEL, GuiPanels.LEVEL_2_PANEL, GuiPanels.LEVEL_3_PANEL};
    public GuiLevel(){
        add(GuiPanels.LEVEL_1_PANEL, BorderLayout.NORTH);
        add(GuiPanels.LEVEL_2_PANEL, BorderLayout.CENTER);
        add(GuiPanels.LEVEL_3_PANEL, BorderLayout.SOUTH);
        initializeButton(GuiPanels.LEVEL_1_PANEL);
        initializeButton(GuiPanels.LEVEL_2_PANEL);
        initializeButton(GuiPanels.LEVEL_3_PANEL);
        for (JComponent i : optionPanels)
            i.setVisible(true);
        setVisible(true);
    }
    private void sendLevel(String level){
        Reference.LEVEL = level;
        setVisible(false);
        GuiMenu.goBack(optionPanels);
    }
    private void initializeButton(JButton button){
        button.addActionListener(e -> {
            if (e.getActionCommand().equals(button.getText())){
                try {
                    switch (button.getText()){
                        case "Level 1":
                            sendLevel("Level 1");
                            break;
                        case "Level 2":
                            sendLevel("Level 2");
                            break;
                        case "Level 3":
                            sendLevel("Level 3");
                            break;
                        default:
                            sendLevel("Level 1");
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
