package main.java.com.watschman.sudoku.gui;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GuiCore extends JPanel implements PropertyChangeListener{
    private GuiCore(){
        super(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //1
        createPanels();
        add(GuiPanels.HEADER_PANEL, BorderLayout.NORTH);
        add(GuiPanels.MAIN_PANEL, BorderLayout.CENTER);
        add(GuiPanels.BUTTON_PANEL, BorderLayout.SOUTH);
    }
    //Algorithmus zum erstellen des Fensters
    public static void createGui(String guiName){
        JFrame jFrame = new JFrame(guiName);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new GuiCore());
        jFrame.setVisible(true);
        jFrame.pack();
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
    private void assignFieldToPanel(JPanel[] panelArray, JFormattedTextField[] componentArray){
        for (int i = 0; i < panelArray.length; i++){
            componentArray[i].setValue((i + 1));
            componentArray[i].setColumns((2));
            componentArray[i].addPropertyChangeListener("value", this);
            panelArray[i].add(componentArray[i]);
        }
    }
    private void createPanels(){
        //Field declaration
        assignFieldToPanel(GuiPanels.Block_1_Array, GuiPanels.Block_1_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_2_Array, GuiPanels.Block_2_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_3_Array, GuiPanels.Block_3_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_4_Array, GuiPanels.Block_4_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_5_Array, GuiPanels.Block_5_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_6_Array, GuiPanels.Block_6_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_7_Array, GuiPanels.Block_7_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_8_Array, GuiPanels.Block_8_Array_TEXT);
        assignFieldToPanel(GuiPanels.Block_9_Array, GuiPanels.Block_9_Array_TEXT);
        //final
        //Row 1
        createPanelLine(GuiPanels.TOP_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_1, GuiPanels.BLOCK_1_FRAME_2, GuiPanels.BLOCK_1_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_4, GuiPanels.BLOCK_1_FRAME_5, GuiPanels.BLOCK_1_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_1_FRAME_7, GuiPanels.BLOCK_1_FRAME_8, GuiPanels.BLOCK_1_FRAME_9, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_1, GuiPanels.BLOCK_2_FRAME_2, GuiPanels.BLOCK_2_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_4, GuiPanels.BLOCK_2_FRAME_5, GuiPanels.BLOCK_2_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_2_FRAME_7, GuiPanels.BLOCK_2_FRAME_8, GuiPanels.BLOCK_2_FRAME_9, false);
        createPanelLine(GuiPanels.TOP_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_1, GuiPanels.BLOCK_3_FRAME_2, GuiPanels.BLOCK_3_FRAME_3, false);
        createPanelLine(GuiPanels.TOP_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_4, GuiPanels.BLOCK_3_FRAME_5, GuiPanels.BLOCK_3_FRAME_6, false);
        createPanelLine(GuiPanels.TOP_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_3_FRAME_7, GuiPanels.BLOCK_3_FRAME_8, GuiPanels.BLOCK_3_FRAME_9, false);
        //Row 2
        createPanelLine(GuiPanels.CENTER_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_1, GuiPanels.BLOCK_4_FRAME_2, GuiPanels.BLOCK_4_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_4, GuiPanels.BLOCK_4_FRAME_5, GuiPanels.BLOCK_4_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_4_FRAME_7, GuiPanels.BLOCK_4_FRAME_8, GuiPanels.BLOCK_4_FRAME_9, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_1, GuiPanels.BLOCK_5_FRAME_2, GuiPanels.BLOCK_5_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_4, GuiPanels.BLOCK_5_FRAME_5, GuiPanels.BLOCK_5_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_5_FRAME_7, GuiPanels.BLOCK_5_FRAME_8, GuiPanels.BLOCK_5_FRAME_9, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_1, GuiPanels.BLOCK_6_FRAME_2, GuiPanels.BLOCK_6_FRAME_3, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_4, GuiPanels.BLOCK_6_FRAME_5, GuiPanels.BLOCK_6_FRAME_6, false);
        createPanelLine(GuiPanels.CENTER_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_6_FRAME_7, GuiPanels.BLOCK_6_FRAME_8, GuiPanels.BLOCK_6_FRAME_9, false);
        //Row 3
        createPanelLine(GuiPanels.BOTTOM_LEFT_TOP_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_1, GuiPanels.BLOCK_7_FRAME_2, GuiPanels.BLOCK_7_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_LEFT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_4, GuiPanels.BLOCK_7_FRAME_5, GuiPanels.BLOCK_7_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_LEFT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_7_FRAME_7, GuiPanels.BLOCK_7_FRAME_8, GuiPanels.BLOCK_7_FRAME_9, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_1, GuiPanels.BLOCK_8_FRAME_2, GuiPanels.BLOCK_8_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_4, GuiPanels.BLOCK_8_FRAME_5, GuiPanels.BLOCK_8_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_8_FRAME_7, GuiPanels.BLOCK_8_FRAME_8, GuiPanels.BLOCK_8_FRAME_9, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_TOP_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_1, GuiPanels.BLOCK_9_FRAME_2, GuiPanels.BLOCK_9_FRAME_3, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_4, GuiPanels.BLOCK_9_FRAME_5, GuiPanels.BLOCK_9_FRAME_6, false);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_BOTTOM_MAIN_PANEL, GuiPanels.BLOCK_9_FRAME_7, GuiPanels.BLOCK_9_FRAME_8, GuiPanels.BLOCK_9_FRAME_9, false);
        //4
        createPanelLine(GuiPanels.TOP_LEFT_MAIN_PANEL, GuiPanels.TOP_LEFT_TOP_MAIN_PANEL, GuiPanels.TOP_LEFT_CENTER_MAIN_PANEL, GuiPanels.TOP_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.TOP_MIDDLE_MAIN_PANEL, GuiPanels.TOP_MIDDLE_TOP_MAIN_PANEL, GuiPanels.TOP_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.TOP_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.TOP_RIGHT_MAIN_PANEL, GuiPanels.TOP_RIGHT_TOP_MAIN_PANEL, GuiPanels.TOP_RIGHT_CENTER_MAIN_PANEL, GuiPanels.TOP_RIGHT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_LEFT_MAIN_PANEL, GuiPanels.CENTER_LEFT_TOP_MAIN_PANEL, GuiPanels.CENTER_LEFT_CENTER_MAIN_PANEL, GuiPanels.CENTER_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_MIDDLE_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_TOP_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.CENTER_RIGHT_MAIN_PANEL, GuiPanels.CENTER_RIGHT_TOP_MAIN_PANEL, GuiPanels.CENTER_RIGHT_CENTER_MAIN_PANEL, GuiPanels.CENTER_RIGHT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_LEFT_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_TOP_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_MIDDLE_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_TOP_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_BOTTOM_MAIN_PANEL, true);
        createPanelLine(GuiPanels.BOTTOM_RIGHT_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_TOP_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_CENTER_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_BOTTOM_MAIN_PANEL, true);
        //3
        createPanelLine(GuiPanels.TOP_MAIN_PANEL, GuiPanels.TOP_LEFT_MAIN_PANEL, GuiPanels.TOP_MIDDLE_MAIN_PANEL, GuiPanels.TOP_RIGHT_MAIN_PANEL, false);
        createPanelLine(GuiPanels.CENTER_MAIN_PANEL, GuiPanels.CENTER_LEFT_MAIN_PANEL, GuiPanels.CENTER_MIDDLE_MAIN_PANEL, GuiPanels.CENTER_RIGHT_MAIN_PANEL, false);
        createPanelLine(GuiPanels.BOTTOM_MAIN_PANEL, GuiPanels.BOTTOM_LEFT_MAIN_PANEL, GuiPanels.BOTTOM_MIDDLE_MAIN_PANEL, GuiPanels.BOTTOM_RIGHT_MAIN_PANEL, false);
        //2
        createPanelLine(GuiPanels.MAIN_PANEL, GuiPanels.TOP_MAIN_PANEL, GuiPanels.CENTER_MAIN_PANEL, GuiPanels.BOTTOM_MAIN_PANEL, true);

    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
