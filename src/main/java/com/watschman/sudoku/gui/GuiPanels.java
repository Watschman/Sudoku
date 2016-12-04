package main.java.com.watschman.sudoku.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Steve on 04.12.2016.
 */
public class GuiPanels {

    //First Declaration
    public static JButton HEADER_PANEL = new JButton("Header");
    public static JPanel MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JButton BUTTON_PANEL = new JButton("Button");

    //Second Stage of creating Sudoku Field
    public static JPanel TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    //Third Stage of creating Sudoku Field
    public static JPanel TOP_LEFT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel TOP_MIDDLE_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel TOP_RIGHT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));

    public static JPanel CENTER_LEFT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel CENTER_MIDDLE_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel CENTER_RIGHT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));

    public static JPanel BOTTOM_LEFT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel BOTTOM_MIDDLE_MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JPanel BOTTOM_RIGHT_MAIN_PANEL = new JPanel(new GridLayout(3, 3));

    //Fourth Stage of creating Sudoku Field
    public static JPanel TOP_LEFT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_LEFT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_LEFT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel TOP_MIDDLE_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_MIDDLE_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_MIDDLE_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel TOP_RIGHT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_RIGHT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel TOP_RIGHT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel CENTER_LEFT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_LEFT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_LEFT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel CENTER_MIDDLE_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_MIDDLE_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_MIDDLE_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel CENTER_RIGHT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_RIGHT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel CENTER_RIGHT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel BOTTOM_LEFT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_LEFT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_LEFT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel BOTTOM_MIDDLE_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_MIDDLE_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_MIDDLE_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    public static JPanel BOTTOM_RIGHT_TOP_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_RIGHT_CENTER_MAIN_PANEL = new JPanel(new GridLayout(1, 3));
    public static JPanel BOTTOM_RIGHT_BOTTOM_MAIN_PANEL = new JPanel(new GridLayout(1, 3));

    //"BLock" oben links.
    public static JPanel BLOCK_1_FRAME_1 = new JPanel();
    public static JPanel BLOCK_1_FRAME_2 = new JPanel();
    public static JPanel BLOCK_1_FRAME_3 = new JPanel();
    public static JPanel BLOCK_1_FRAME_4 = new JPanel();
    public static JPanel BLOCK_1_FRAME_5 = new JPanel();
    public static JPanel BLOCK_1_FRAME_6 = new JPanel();
    public static JPanel BLOCK_1_FRAME_7 = new JPanel();
    public static JPanel BLOCK_1_FRAME_8 = new JPanel();
    public static JPanel BLOCK_1_FRAME_9 = new JPanel();

    //"BLock" oben mitte.
    public static JPanel BLOCK_2_FRAME_1 = new JPanel();
    public static JPanel BLOCK_2_FRAME_2 = new JPanel();
    public static JPanel BLOCK_2_FRAME_3 = new JPanel();
    public static JPanel BLOCK_2_FRAME_4 = new JPanel();
    public static JPanel BLOCK_2_FRAME_5 = new JPanel();
    public static JPanel BLOCK_2_FRAME_6 = new JPanel();
    public static JPanel BLOCK_2_FRAME_7 = new JPanel();
    public static JPanel BLOCK_2_FRAME_8 = new JPanel();
    public static JPanel BLOCK_2_FRAME_9 = new JPanel();

    //"BLock" oben rechts.
    public static JPanel BLOCK_3_FRAME_1 = new JPanel();
    public static JPanel BLOCK_3_FRAME_2 = new JPanel();
    public static JPanel BLOCK_3_FRAME_3 = new JPanel();
    public static JPanel BLOCK_3_FRAME_4 = new JPanel();
    public static JPanel BLOCK_3_FRAME_5 = new JPanel();
    public static JPanel BLOCK_3_FRAME_6 = new JPanel();
    public static JPanel BLOCK_3_FRAME_7 = new JPanel();
    public static JPanel BLOCK_3_FRAME_8 = new JPanel();
    public static JPanel BLOCK_3_FRAME_9 = new JPanel();

    //"BLock" zentrum links.
    public static JPanel BLOCK_4_FRAME_1 = new JPanel();
    public static JPanel BLOCK_4_FRAME_2 = new JPanel();
    public static JPanel BLOCK_4_FRAME_3 = new JPanel();
    public static JPanel BLOCK_4_FRAME_4 = new JPanel();
    public static JPanel BLOCK_4_FRAME_5 = new JPanel();
    public static JPanel BLOCK_4_FRAME_6 = new JPanel();
    public static JPanel BLOCK_4_FRAME_7 = new JPanel();
    public static JPanel BLOCK_4_FRAME_8 = new JPanel();
    public static JPanel BLOCK_4_FRAME_9 = new JPanel();

    //"BLock" zentrum mitte.
    public static JPanel BLOCK_5_FRAME_1 = new JPanel();
    public static JPanel BLOCK_5_FRAME_2 = new JPanel();
    public static JPanel BLOCK_5_FRAME_3 = new JPanel();
    public static JPanel BLOCK_5_FRAME_4 = new JPanel();
    public static JPanel BLOCK_5_FRAME_5 = new JPanel();
    public static JPanel BLOCK_5_FRAME_6 = new JPanel();
    public static JPanel BLOCK_5_FRAME_7 = new JPanel();
    public static JPanel BLOCK_5_FRAME_8 = new JPanel();
    public static JPanel BLOCK_5_FRAME_9 = new JPanel();

    //"BLock" zentrum rechts.
    public static JPanel BLOCK_6_FRAME_1 = new JPanel();
    public static JPanel BLOCK_6_FRAME_2 = new JPanel();
    public static JPanel BLOCK_6_FRAME_3 = new JPanel();
    public static JPanel BLOCK_6_FRAME_4 = new JPanel();
    public static JPanel BLOCK_6_FRAME_5 = new JPanel();
    public static JPanel BLOCK_6_FRAME_6 = new JPanel();
    public static JPanel BLOCK_6_FRAME_7 = new JPanel();
    public static JPanel BLOCK_6_FRAME_8 = new JPanel();
    public static JPanel BLOCK_6_FRAME_9 = new JPanel();

    //"BLock" unten links.
    public static JPanel BLOCK_7_FRAME_1 = new JPanel();
    public static JPanel BLOCK_7_FRAME_2 = new JPanel();
    public static JPanel BLOCK_7_FRAME_3 = new JPanel();
    public static JPanel BLOCK_7_FRAME_4 = new JPanel();
    public static JPanel BLOCK_7_FRAME_5 = new JPanel();
    public static JPanel BLOCK_7_FRAME_6 = new JPanel();
    public static JPanel BLOCK_7_FRAME_7 = new JPanel();
    public static JPanel BLOCK_7_FRAME_8 = new JPanel();
    public static JPanel BLOCK_7_FRAME_9 = new JPanel();

    //"BLock" unten mitte.
    public static JPanel BLOCK_8_FRAME_1 = new JPanel();
    public static JPanel BLOCK_8_FRAME_2 = new JPanel();
    public static JPanel BLOCK_8_FRAME_3 = new JPanel();
    public static JPanel BLOCK_8_FRAME_4 = new JPanel();
    public static JPanel BLOCK_8_FRAME_5 = new JPanel();
    public static JPanel BLOCK_8_FRAME_6 = new JPanel();
    public static JPanel BLOCK_8_FRAME_7 = new JPanel();
    public static JPanel BLOCK_8_FRAME_8 = new JPanel();
    public static JPanel BLOCK_8_FRAME_9 = new JPanel();

    //"BLock" unten rechts.
    public static JPanel BLOCK_9_FRAME_1 = new JPanel();
    public static JPanel BLOCK_9_FRAME_2 = new JPanel();
    public static JPanel BLOCK_9_FRAME_3 = new JPanel();
    public static JPanel BLOCK_9_FRAME_4 = new JPanel();
    public static JPanel BLOCK_9_FRAME_5 = new JPanel();
    public static JPanel BLOCK_9_FRAME_6 = new JPanel();
    public static JPanel BLOCK_9_FRAME_7 = new JPanel();
    public static JPanel BLOCK_9_FRAME_8 = new JPanel();
    public static JPanel BLOCK_9_FRAME_9 = new JPanel();

    //"BLock" oben links.
    public static JFormattedTextField BLOCK_1_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_1_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" oben mitte.
    public static JFormattedTextField BLOCK_2_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_2_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" oben rechts.
    public static JFormattedTextField BLOCK_3_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_3_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" zentrum links.
    public static JFormattedTextField BLOCK_4_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_4_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" zentrum mitte.
    public static JFormattedTextField BLOCK_5_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_5_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" zentrum rechts.
    public static JFormattedTextField BLOCK_6_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_6_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" unten links.
    public static JFormattedTextField BLOCK_7_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_7_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" unten mitte.
    public static JFormattedTextField BLOCK_8_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_8_FRAME_9_TEXT = new JFormattedTextField();

    //"BLock" unten rechts.
    public static JFormattedTextField BLOCK_9_FRAME_1_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_2_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_3_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_4_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_5_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_6_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_7_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_8_TEXT = new JFormattedTextField();
    public static JFormattedTextField BLOCK_9_FRAME_9_TEXT = new JFormattedTextField();

    public static final JPanel[] Block_1_Array = new JPanel[] {BLOCK_1_FRAME_1, BLOCK_1_FRAME_2, BLOCK_1_FRAME_3, BLOCK_1_FRAME_4, BLOCK_1_FRAME_5, BLOCK_1_FRAME_6, BLOCK_1_FRAME_7, BLOCK_1_FRAME_8, BLOCK_1_FRAME_9};
    public static final JPanel[] Block_2_Array = new JPanel[] {BLOCK_2_FRAME_1, BLOCK_2_FRAME_2, BLOCK_2_FRAME_3, BLOCK_2_FRAME_4, BLOCK_2_FRAME_5, BLOCK_2_FRAME_6, BLOCK_2_FRAME_7, BLOCK_2_FRAME_8, BLOCK_2_FRAME_9};
    public static final JPanel[] Block_3_Array = new JPanel[] {BLOCK_3_FRAME_1, BLOCK_3_FRAME_2, BLOCK_3_FRAME_3, BLOCK_3_FRAME_4, BLOCK_3_FRAME_5, BLOCK_3_FRAME_6, BLOCK_3_FRAME_7, BLOCK_3_FRAME_8, BLOCK_3_FRAME_9};
    public static final JPanel[] Block_4_Array = new JPanel[] {BLOCK_4_FRAME_1, BLOCK_4_FRAME_2, BLOCK_4_FRAME_3, BLOCK_4_FRAME_4, BLOCK_4_FRAME_5, BLOCK_4_FRAME_6, BLOCK_4_FRAME_7, BLOCK_4_FRAME_8, BLOCK_4_FRAME_9};
    public static final JPanel[] Block_5_Array = new JPanel[] {BLOCK_5_FRAME_1, BLOCK_5_FRAME_2, BLOCK_5_FRAME_3, BLOCK_5_FRAME_4, BLOCK_5_FRAME_5, BLOCK_5_FRAME_6, BLOCK_5_FRAME_7, BLOCK_5_FRAME_8, BLOCK_5_FRAME_9};
    public static final JPanel[] Block_6_Array = new JPanel[] {BLOCK_6_FRAME_1, BLOCK_6_FRAME_2, BLOCK_6_FRAME_3, BLOCK_6_FRAME_4, BLOCK_6_FRAME_5, BLOCK_6_FRAME_6, BLOCK_6_FRAME_7, BLOCK_6_FRAME_8, BLOCK_6_FRAME_9};
    public static final JPanel[] Block_7_Array = new JPanel[] {BLOCK_7_FRAME_1, BLOCK_7_FRAME_2, BLOCK_7_FRAME_3, BLOCK_7_FRAME_4, BLOCK_7_FRAME_5, BLOCK_7_FRAME_6, BLOCK_7_FRAME_7, BLOCK_7_FRAME_8, BLOCK_7_FRAME_9};
    public static final JPanel[] Block_8_Array = new JPanel[] {BLOCK_8_FRAME_1, BLOCK_8_FRAME_2, BLOCK_8_FRAME_3, BLOCK_8_FRAME_4, BLOCK_8_FRAME_5, BLOCK_8_FRAME_6, BLOCK_8_FRAME_7, BLOCK_8_FRAME_8, BLOCK_8_FRAME_9};
    public static final JPanel[] Block_9_Array = new JPanel[] {BLOCK_9_FRAME_1, BLOCK_9_FRAME_2, BLOCK_9_FRAME_3, BLOCK_9_FRAME_4, BLOCK_9_FRAME_5, BLOCK_9_FRAME_6, BLOCK_9_FRAME_7, BLOCK_9_FRAME_8, BLOCK_9_FRAME_9};

    public static final JFormattedTextField[] Block_1_Array_TEXT = new JFormattedTextField[] {BLOCK_1_FRAME_1_TEXT, BLOCK_1_FRAME_2_TEXT, BLOCK_1_FRAME_3_TEXT, BLOCK_1_FRAME_4_TEXT, BLOCK_1_FRAME_5_TEXT, BLOCK_1_FRAME_6_TEXT, BLOCK_1_FRAME_7_TEXT, BLOCK_1_FRAME_8_TEXT, BLOCK_1_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_2_Array_TEXT = new JFormattedTextField[] {BLOCK_2_FRAME_1_TEXT, BLOCK_2_FRAME_2_TEXT, BLOCK_2_FRAME_3_TEXT, BLOCK_2_FRAME_4_TEXT, BLOCK_2_FRAME_5_TEXT, BLOCK_2_FRAME_6_TEXT, BLOCK_2_FRAME_7_TEXT, BLOCK_2_FRAME_8_TEXT, BLOCK_2_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_3_Array_TEXT = new JFormattedTextField[] {BLOCK_3_FRAME_1_TEXT, BLOCK_3_FRAME_2_TEXT, BLOCK_3_FRAME_3_TEXT, BLOCK_3_FRAME_4_TEXT, BLOCK_3_FRAME_5_TEXT, BLOCK_3_FRAME_6_TEXT, BLOCK_3_FRAME_7_TEXT, BLOCK_3_FRAME_8_TEXT, BLOCK_3_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_4_Array_TEXT = new JFormattedTextField[] {BLOCK_4_FRAME_1_TEXT, BLOCK_4_FRAME_2_TEXT, BLOCK_4_FRAME_3_TEXT, BLOCK_4_FRAME_4_TEXT, BLOCK_4_FRAME_5_TEXT, BLOCK_4_FRAME_6_TEXT, BLOCK_4_FRAME_7_TEXT, BLOCK_4_FRAME_8_TEXT, BLOCK_4_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_5_Array_TEXT = new JFormattedTextField[] {BLOCK_5_FRAME_1_TEXT, BLOCK_5_FRAME_2_TEXT, BLOCK_5_FRAME_3_TEXT, BLOCK_5_FRAME_4_TEXT, BLOCK_5_FRAME_5_TEXT, BLOCK_5_FRAME_6_TEXT, BLOCK_5_FRAME_7_TEXT, BLOCK_5_FRAME_8_TEXT, BLOCK_5_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_6_Array_TEXT = new JFormattedTextField[] {BLOCK_6_FRAME_1_TEXT, BLOCK_6_FRAME_2_TEXT, BLOCK_6_FRAME_3_TEXT, BLOCK_6_FRAME_4_TEXT, BLOCK_6_FRAME_5_TEXT, BLOCK_6_FRAME_6_TEXT, BLOCK_6_FRAME_7_TEXT, BLOCK_6_FRAME_8_TEXT, BLOCK_6_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_7_Array_TEXT = new JFormattedTextField[] {BLOCK_7_FRAME_1_TEXT, BLOCK_7_FRAME_2_TEXT, BLOCK_7_FRAME_3_TEXT, BLOCK_7_FRAME_4_TEXT, BLOCK_7_FRAME_5_TEXT, BLOCK_7_FRAME_6_TEXT, BLOCK_7_FRAME_7_TEXT, BLOCK_7_FRAME_8_TEXT, BLOCK_7_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_8_Array_TEXT = new JFormattedTextField[] {BLOCK_8_FRAME_1_TEXT, BLOCK_8_FRAME_2_TEXT, BLOCK_8_FRAME_3_TEXT, BLOCK_8_FRAME_4_TEXT, BLOCK_8_FRAME_5_TEXT, BLOCK_8_FRAME_6_TEXT, BLOCK_8_FRAME_7_TEXT, BLOCK_8_FRAME_8_TEXT, BLOCK_8_FRAME_9_TEXT};
    public static final JFormattedTextField[] Block_9_Array_TEXT = new JFormattedTextField[] {BLOCK_9_FRAME_1_TEXT, BLOCK_9_FRAME_2_TEXT, BLOCK_9_FRAME_3_TEXT, BLOCK_9_FRAME_4_TEXT, BLOCK_9_FRAME_5_TEXT, BLOCK_9_FRAME_6_TEXT, BLOCK_9_FRAME_7_TEXT, BLOCK_9_FRAME_8_TEXT, BLOCK_9_FRAME_9_TEXT};
}
