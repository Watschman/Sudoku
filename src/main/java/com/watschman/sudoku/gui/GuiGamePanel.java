package main.java.com.watschman.sudoku.gui;

import main.java.com.watschman.sudoku.berechnungsAlgorithmus.berechnungsAlgorithmusCore;
import main.java.com.watschman.sudoku.reference.Reference;
import main.java.com.watschman.sudoku.utility.LogHelper;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GuiGamePanel extends JPanel implements PropertyChangeListener{
    int[] solutions;
    public GuiGamePanel(){
        super(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        new GuiPanels();
        initializeButton(GuiPanels.BUTTON_PANEL);
        createPanels();
        add(GuiPanels.HEADER_PANEL, BorderLayout.NORTH);
        add(GuiPanels.MAIN_PANEL, BorderLayout.CENTER);
        add(GuiPanels.BUTTON_PANEL, BorderLayout.SOUTH);
        setVisible(true);
    }
    private static void createPanelLine(JPanel mainPanel, JPanel panelOne, JPanel panelTwo, JPanel panelThree, boolean vertical){
        if (vertical) {
            mainPanel.add(panelOne, BorderLayout.NORTH);
            mainPanel.add(panelTwo, BorderLayout.WEST);
            mainPanel.add(panelThree, BorderLayout.SOUTH);
        }else {
            mainPanel.add(panelOne, BorderLayout.WEST);
            mainPanel.add(panelTwo, BorderLayout.CENTER);
            mainPanel.add(panelThree, BorderLayout.EAST);
        }
    }
    private void assignFieldToPanel(JPanel[] panelArray, JFormattedTextField[] componentArray, int[] shownSolutions){
        for (int i = 0; i < panelArray.length; i++){
            if (shownSolutions[i] != 0)
                componentArray[i].setValue(shownSolutions[i]);
            componentArray[i].setColumns(2);
            componentArray[i].addPropertyChangeListener("value", this);
            panelArray[i].add(componentArray[i]);
        }
    }
    private void createPanels(){
        //Field declaration
        //TestArray for Demonstration Purposes
        int[] testArray = new int[]{0, 0, 1, 2, 6, 4, 0, 9, 5};
        assignFieldToPanel(GuiPanels.BLOCK_1_ARRAY, GuiPanels.BLOCK_1_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_2_ARRAY, GuiPanels.BLOCK_2_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_3_ARRAY, GuiPanels.BLOCK_3_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_4_ARRAY, GuiPanels.BLOCK_4_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_5_ARRAY, GuiPanels.BLOCK_5_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_6_ARRAY, GuiPanels.BLOCK_6_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_7_ARRAY, GuiPanels.BLOCK_7_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_8_ARRAY, GuiPanels.BLOCK_8_ARRAY_TEXT, testArray);
        assignFieldToPanel(GuiPanels.BLOCK_9_ARRAY, GuiPanels.BLOCK_9_ARRAY_TEXT, testArray);

        createPanelLine(GuiPanels.TOP_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_1, GuiPanels.BLOCK_1_FRAME_2, GuiPanels.BLOCK_1_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_4, GuiPanels.BLOCK_1_FRAME_5, GuiPanels.BLOCK_1_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_7, GuiPanels.BLOCK_1_FRAME_8, GuiPanels.BLOCK_1_FRAME_9, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_1, GuiPanels.BLOCK_2_FRAME_2, GuiPanels.BLOCK_2_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_4, GuiPanels.BLOCK_2_FRAME_5, GuiPanels.BLOCK_2_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_7, GuiPanels.BLOCK_2_FRAME_8, GuiPanels.BLOCK_2_FRAME_9, false);
        createPanelLine(GuiPanels.TOP_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_1, GuiPanels.BLOCK_3_FRAME_2, GuiPanels.BLOCK_3_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_4, GuiPanels.BLOCK_3_FRAME_5, GuiPanels.BLOCK_3_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_7, GuiPanels.BLOCK_3_FRAME_8, GuiPanels.BLOCK_3_FRAME_9, false);

        createPanelLine(GuiPanels.CENTER_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_1, GuiPanels.BLOCK_4_FRAME_2, GuiPanels.BLOCK_4_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_4, GuiPanels.BLOCK_4_FRAME_5, GuiPanels.BLOCK_4_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_7, GuiPanels.BLOCK_4_FRAME_8, GuiPanels.BLOCK_4_FRAME_9, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_1, GuiPanels.BLOCK_5_FRAME_2, GuiPanels.BLOCK_5_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_4, GuiPanels.BLOCK_5_FRAME_5, GuiPanels.BLOCK_5_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_7, GuiPanels.BLOCK_5_FRAME_8, GuiPanels.BLOCK_5_FRAME_9, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_1, GuiPanels.BLOCK_6_FRAME_2, GuiPanels.BLOCK_6_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_4, GuiPanels.BLOCK_6_FRAME_5, GuiPanels.BLOCK_6_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_7, GuiPanels.BLOCK_6_FRAME_8, GuiPanels.BLOCK_6_FRAME_9, false);

        createPanelLine(GuiPanels.BOTTOM_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_1, GuiPanels.BLOCK_7_FRAME_2, GuiPanels.BLOCK_7_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_4, GuiPanels.BLOCK_7_FRAME_5, GuiPanels.BLOCK_7_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_7, GuiPanels.BLOCK_7_FRAME_8, GuiPanels.BLOCK_7_FRAME_9, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_1, GuiPanels.BLOCK_8_FRAME_2, GuiPanels.BLOCK_8_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_4, GuiPanels.BLOCK_8_FRAME_5, GuiPanels.BLOCK_8_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_7, GuiPanels.BLOCK_8_FRAME_8, GuiPanels.BLOCK_8_FRAME_9, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_1, GuiPanels.BLOCK_9_FRAME_2, GuiPanels.BLOCK_9_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_4, GuiPanels.BLOCK_9_FRAME_5, GuiPanels.BLOCK_9_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_7, GuiPanels.BLOCK_9_FRAME_8, GuiPanels.BLOCK_9_FRAME_9, false);

        createPanelLine(GuiPanels.TOP_LEFT_MAIN_PANEL, GuiPanels.TOP_LEFT_TOP_MAIN_PANEL, GuiPanels.TOP_LEFT_CENTER_MAIN_PANEL, GuiPanels.TOP_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.TOP_MIDDLE_MAIN_PANEL, GuiPanels.TOP_MIDDLE_TOP_MAIN_PANEL, GuiPanels.TOP_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.TOP_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.TOP_RIGHT_MAIN_PANEL, GuiPanels.TOP_RIGHT_TOP_MAIN_PANEL, GuiPanels.TOP_RIGHT_CENTER_MAIN_PANEL, GuiPanels.TOP_RIGHT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_LEFT_MAIN_PANEL, GuiPanels.CENTER_LEFT_TOP_MAIN_PANEL, GuiPanels.CENTER_LEFT_CENTER_MAIN_PANEL, GuiPanels.CENTER_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_MIDDLE_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_TOP_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_RIGHT_MAIN_PANEL, GuiPanels.CENTER_RIGHT_TOP_MAIN_PANEL, GuiPanels.CENTER_RIGHT_CENTER_MAIN_PANEL, GuiPanels.CENTER_RIGHT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_LEFT_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_TOP_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_TOP_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_BOTTOM_MAIN_PANEL, true);

        createPanelLine(GuiPanels.TOP_MAIN_PANEL, GuiPanels.TOP_LEFT_MAIN_PANEL, GuiPanels.TOP_MIDDLE_MAIN_PANEL, GuiPanels.TOP_RIGHT_MAIN_PANEL, false);
        createPanelLine(GuiPanels.CENTER_MAIN_PANEL, GuiPanels.CENTER_LEFT_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_MAIN_PANEL, GuiPanels.CENTER_RIGHT_MAIN_PANEL, false);
        createPanelLine(GuiPanels.BOTTOM_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_MAIN_PANEL, false);

        createPanelLine(GuiPanels.MAIN_PANEL, GuiPanels.TOP_MAIN_PANEL, GuiPanels.CENTER_MAIN_PANEL, GuiPanels.BOTTOM_MAIN_PANEL, true);

    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }
    public void setSolutions(JFormattedTextField[] solutionsText){
        int[] newSolutions = new int[solutionsText.length];
        for (int i = 0; i < solutionsText.length; i++){
            if (solutionsText[i].getValue() == null)
                newSolutions[i] = 1;
            else
                newSolutions[i] = (int)(solutionsText[i].getValue());
        }
        this.solutions = newSolutions;
    }
    public int[] getSolutions(){
        return this.solutions;
    }

    private void initializeButton(JButton button){
        button.addActionListener(e -> {
            if (e.getActionCommand().equals("Compare Solutions")){
                try {
                    setSolutions(GuiPanels.ALL_BLOCKS_ARRAY_TEXT);
                    berechnungsAlgorithmusCore.compareSolutions(getSolutions());
                }catch (Exception ex){
                    LogHelper.fatal("Exception during operation " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
    }
}
