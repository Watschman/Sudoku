package main.java.com.watschman.sudoku.gui;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class GuiPanels {
    /* Level */
    public static JButton LEVEL_1_PANEL = new JButton("Level 1");
    public static JButton LEVEL_2_PANEL = new JButton("Level 2");
    public static JButton LEVEL_3_PANEL = new JButton("Level 3");
    /* Menu */
    public static JButton START_GAME_PANEL = new JButton("Start Game");
    public static JButton QUIT_PANEL = new JButton("Quit");
    public static JButton OPTION_PANEL = new JButton("Choose Level");
    /* Game*/
    //First Declaration
    public static JLabel HEADER_PANEL = new JLabel("Header", SwingConstants.CENTER);
    public static JPanel MAIN_PANEL = new JPanel(new GridLayout(3, 3));
    public static JButton BUTTON_PANEL = new JButton("Compare Solutions");

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

    public static NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
    public static NumberFormatter NUMBER_FORMATTER = new NumberFormatter(NUMBER_FORMAT);

    //"BLock" oben links.
    public static JFormattedTextField BLOCK_1_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_1_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" oben mitte.
    public static JFormattedTextField BLOCK_2_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_2_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" oben rechts.
    public static JFormattedTextField BLOCK_3_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_3_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" zentrum links.
    public static JFormattedTextField BLOCK_4_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_4_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" zentrum mitte.
    public static JFormattedTextField BLOCK_5_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_5_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" zentrum rechts.
    public static JFormattedTextField BLOCK_6_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_6_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" unten links.
    public static JFormattedTextField BLOCK_7_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_7_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" unten mitte.
    public static JFormattedTextField BLOCK_8_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_8_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    //"BLock" unten rechts.
    public static JFormattedTextField BLOCK_9_FRAME_1_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_2_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_3_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_4_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_5_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_6_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_7_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_8_TEXT = new JFormattedTextField(NUMBER_FORMATTER);
    public static JFormattedTextField BLOCK_9_FRAME_9_TEXT = new JFormattedTextField(NUMBER_FORMATTER);

    public static final JPanel[] BLOCK_1_ARRAY = new JPanel[] {BLOCK_1_FRAME_1, BLOCK_1_FRAME_2, BLOCK_1_FRAME_3, BLOCK_1_FRAME_4, BLOCK_1_FRAME_5, BLOCK_1_FRAME_6, BLOCK_1_FRAME_7, BLOCK_1_FRAME_8, BLOCK_1_FRAME_9};
    public static final JPanel[] BLOCK_2_ARRAY = new JPanel[] {BLOCK_2_FRAME_1, BLOCK_2_FRAME_2, BLOCK_2_FRAME_3, BLOCK_2_FRAME_4, BLOCK_2_FRAME_5, BLOCK_2_FRAME_6, BLOCK_2_FRAME_7, BLOCK_2_FRAME_8, BLOCK_2_FRAME_9};
    public static final JPanel[] BLOCK_3_ARRAY = new JPanel[] {BLOCK_3_FRAME_1, BLOCK_3_FRAME_2, BLOCK_3_FRAME_3, BLOCK_3_FRAME_4, BLOCK_3_FRAME_5, BLOCK_3_FRAME_6, BLOCK_3_FRAME_7, BLOCK_3_FRAME_8, BLOCK_3_FRAME_9};
    public static final JPanel[] BLOCK_4_ARRAY = new JPanel[] {BLOCK_4_FRAME_1, BLOCK_4_FRAME_2, BLOCK_4_FRAME_3, BLOCK_4_FRAME_4, BLOCK_4_FRAME_5, BLOCK_4_FRAME_6, BLOCK_4_FRAME_7, BLOCK_4_FRAME_8, BLOCK_4_FRAME_9};
    public static final JPanel[] BLOCK_5_ARRAY = new JPanel[] {BLOCK_5_FRAME_1, BLOCK_5_FRAME_2, BLOCK_5_FRAME_3, BLOCK_5_FRAME_4, BLOCK_5_FRAME_5, BLOCK_5_FRAME_6, BLOCK_5_FRAME_7, BLOCK_5_FRAME_8, BLOCK_5_FRAME_9};
    public static final JPanel[] BLOCK_6_ARRAY = new JPanel[] {BLOCK_6_FRAME_1, BLOCK_6_FRAME_2, BLOCK_6_FRAME_3, BLOCK_6_FRAME_4, BLOCK_6_FRAME_5, BLOCK_6_FRAME_6, BLOCK_6_FRAME_7, BLOCK_6_FRAME_8, BLOCK_6_FRAME_9};
    public static final JPanel[] BLOCK_7_ARRAY = new JPanel[] {BLOCK_7_FRAME_1, BLOCK_7_FRAME_2, BLOCK_7_FRAME_3, BLOCK_7_FRAME_4, BLOCK_7_FRAME_5, BLOCK_7_FRAME_6, BLOCK_7_FRAME_7, BLOCK_7_FRAME_8, BLOCK_7_FRAME_9};
    public static final JPanel[] BLOCK_8_ARRAY = new JPanel[] {BLOCK_8_FRAME_1, BLOCK_8_FRAME_2, BLOCK_8_FRAME_3, BLOCK_8_FRAME_4, BLOCK_8_FRAME_5, BLOCK_8_FRAME_6, BLOCK_8_FRAME_7, BLOCK_8_FRAME_8, BLOCK_8_FRAME_9};
    public static final JPanel[] BLOCK_9_ARRAY = new JPanel[] {BLOCK_9_FRAME_1, BLOCK_9_FRAME_2, BLOCK_9_FRAME_3, BLOCK_9_FRAME_4, BLOCK_9_FRAME_5, BLOCK_9_FRAME_6, BLOCK_9_FRAME_7, BLOCK_9_FRAME_8, BLOCK_9_FRAME_9};

    public static final JPanel[] ALL_BLOCKS_ARRAY = new JPanel[]{
            BLOCK_1_FRAME_1, BLOCK_1_FRAME_2, BLOCK_1_FRAME_3, BLOCK_1_FRAME_4, BLOCK_1_FRAME_5, BLOCK_1_FRAME_6, BLOCK_1_FRAME_7, BLOCK_1_FRAME_8, BLOCK_1_FRAME_9,
            BLOCK_2_FRAME_1, BLOCK_2_FRAME_2, BLOCK_2_FRAME_3, BLOCK_2_FRAME_4, BLOCK_2_FRAME_5, BLOCK_2_FRAME_6, BLOCK_2_FRAME_7, BLOCK_2_FRAME_8, BLOCK_2_FRAME_9,
            BLOCK_3_FRAME_1, BLOCK_3_FRAME_2, BLOCK_3_FRAME_3, BLOCK_3_FRAME_4, BLOCK_3_FRAME_5, BLOCK_3_FRAME_6, BLOCK_3_FRAME_7, BLOCK_3_FRAME_8, BLOCK_3_FRAME_9,
            BLOCK_4_FRAME_1, BLOCK_4_FRAME_2, BLOCK_4_FRAME_3, BLOCK_4_FRAME_4, BLOCK_4_FRAME_5, BLOCK_4_FRAME_6, BLOCK_4_FRAME_7, BLOCK_4_FRAME_8, BLOCK_4_FRAME_9,
            BLOCK_5_FRAME_1, BLOCK_5_FRAME_2, BLOCK_5_FRAME_3, BLOCK_5_FRAME_4, BLOCK_5_FRAME_5, BLOCK_5_FRAME_6, BLOCK_5_FRAME_7, BLOCK_5_FRAME_8, BLOCK_5_FRAME_9,
            BLOCK_6_FRAME_1, BLOCK_6_FRAME_2, BLOCK_6_FRAME_3, BLOCK_6_FRAME_4, BLOCK_6_FRAME_5, BLOCK_6_FRAME_6, BLOCK_6_FRAME_7, BLOCK_6_FRAME_8, BLOCK_6_FRAME_9,
            BLOCK_7_FRAME_1, BLOCK_7_FRAME_2, BLOCK_7_FRAME_3, BLOCK_7_FRAME_4, BLOCK_7_FRAME_5, BLOCK_7_FRAME_6, BLOCK_7_FRAME_7, BLOCK_7_FRAME_8, BLOCK_7_FRAME_9,
            BLOCK_8_FRAME_1, BLOCK_8_FRAME_2, BLOCK_8_FRAME_3, BLOCK_8_FRAME_4, BLOCK_8_FRAME_5, BLOCK_8_FRAME_6, BLOCK_8_FRAME_7, BLOCK_8_FRAME_8, BLOCK_8_FRAME_9,
            BLOCK_9_FRAME_1, BLOCK_9_FRAME_2, BLOCK_9_FRAME_3, BLOCK_9_FRAME_4, BLOCK_9_FRAME_5, BLOCK_9_FRAME_6, BLOCK_9_FRAME_7, BLOCK_9_FRAME_8, BLOCK_9_FRAME_9
    };
    public static final JComponent[] ALL_GAME_PANELS = new JComponent[]{
            BLOCK_1_FRAME_1, BLOCK_1_FRAME_2, BLOCK_1_FRAME_3, BLOCK_1_FRAME_4, BLOCK_1_FRAME_5, BLOCK_1_FRAME_6, BLOCK_1_FRAME_7, BLOCK_1_FRAME_8, BLOCK_1_FRAME_9,
            BLOCK_2_FRAME_1, BLOCK_2_FRAME_2, BLOCK_2_FRAME_3, BLOCK_2_FRAME_4, BLOCK_2_FRAME_5, BLOCK_2_FRAME_6, BLOCK_2_FRAME_7, BLOCK_2_FRAME_8, BLOCK_2_FRAME_9,
            BLOCK_3_FRAME_1, BLOCK_3_FRAME_2, BLOCK_3_FRAME_3, BLOCK_3_FRAME_4, BLOCK_3_FRAME_5, BLOCK_3_FRAME_6, BLOCK_3_FRAME_7, BLOCK_3_FRAME_8, BLOCK_3_FRAME_9,
            BLOCK_4_FRAME_1, BLOCK_4_FRAME_2, BLOCK_4_FRAME_3, BLOCK_4_FRAME_4, BLOCK_4_FRAME_5, BLOCK_4_FRAME_6, BLOCK_4_FRAME_7, BLOCK_4_FRAME_8, BLOCK_4_FRAME_9,
            BLOCK_5_FRAME_1, BLOCK_5_FRAME_2, BLOCK_5_FRAME_3, BLOCK_5_FRAME_4, BLOCK_5_FRAME_5, BLOCK_5_FRAME_6, BLOCK_5_FRAME_7, BLOCK_5_FRAME_8, BLOCK_5_FRAME_9,
            BLOCK_6_FRAME_1, BLOCK_6_FRAME_2, BLOCK_6_FRAME_3, BLOCK_6_FRAME_4, BLOCK_6_FRAME_5, BLOCK_6_FRAME_6, BLOCK_6_FRAME_7, BLOCK_6_FRAME_8, BLOCK_6_FRAME_9,
            BLOCK_7_FRAME_1, BLOCK_7_FRAME_2, BLOCK_7_FRAME_3, BLOCK_7_FRAME_4, BLOCK_7_FRAME_5, BLOCK_7_FRAME_6, BLOCK_7_FRAME_7, BLOCK_7_FRAME_8, BLOCK_7_FRAME_9,
            BLOCK_8_FRAME_1, BLOCK_8_FRAME_2, BLOCK_8_FRAME_3, BLOCK_8_FRAME_4, BLOCK_8_FRAME_5, BLOCK_8_FRAME_6, BLOCK_8_FRAME_7, BLOCK_8_FRAME_8, BLOCK_8_FRAME_9,
            BLOCK_9_FRAME_1, BLOCK_9_FRAME_2, BLOCK_9_FRAME_3, BLOCK_9_FRAME_4, BLOCK_9_FRAME_5, BLOCK_9_FRAME_6, BLOCK_9_FRAME_7, BLOCK_9_FRAME_8, BLOCK_9_FRAME_9,
            MAIN_PANEL, HEADER_PANEL, BUTTON_PANEL
    };

    public static final JFormattedTextField[] BLOCK_1_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_1_FRAME_1_TEXT, BLOCK_1_FRAME_2_TEXT, BLOCK_1_FRAME_3_TEXT, BLOCK_1_FRAME_4_TEXT, BLOCK_1_FRAME_5_TEXT, BLOCK_1_FRAME_6_TEXT, BLOCK_1_FRAME_7_TEXT, BLOCK_1_FRAME_8_TEXT, BLOCK_1_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_2_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_2_FRAME_1_TEXT, BLOCK_2_FRAME_2_TEXT, BLOCK_2_FRAME_3_TEXT, BLOCK_2_FRAME_4_TEXT, BLOCK_2_FRAME_5_TEXT, BLOCK_2_FRAME_6_TEXT, BLOCK_2_FRAME_7_TEXT, BLOCK_2_FRAME_8_TEXT, BLOCK_2_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_3_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_3_FRAME_1_TEXT, BLOCK_3_FRAME_2_TEXT, BLOCK_3_FRAME_3_TEXT, BLOCK_3_FRAME_4_TEXT, BLOCK_3_FRAME_5_TEXT, BLOCK_3_FRAME_6_TEXT, BLOCK_3_FRAME_7_TEXT, BLOCK_3_FRAME_8_TEXT, BLOCK_3_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_4_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_4_FRAME_1_TEXT, BLOCK_4_FRAME_2_TEXT, BLOCK_4_FRAME_3_TEXT, BLOCK_4_FRAME_4_TEXT, BLOCK_4_FRAME_5_TEXT, BLOCK_4_FRAME_6_TEXT, BLOCK_4_FRAME_7_TEXT, BLOCK_4_FRAME_8_TEXT, BLOCK_4_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_5_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_5_FRAME_1_TEXT, BLOCK_5_FRAME_2_TEXT, BLOCK_5_FRAME_3_TEXT, BLOCK_5_FRAME_4_TEXT, BLOCK_5_FRAME_5_TEXT, BLOCK_5_FRAME_6_TEXT, BLOCK_5_FRAME_7_TEXT, BLOCK_5_FRAME_8_TEXT, BLOCK_5_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_6_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_6_FRAME_1_TEXT, BLOCK_6_FRAME_2_TEXT, BLOCK_6_FRAME_3_TEXT, BLOCK_6_FRAME_4_TEXT, BLOCK_6_FRAME_5_TEXT, BLOCK_6_FRAME_6_TEXT, BLOCK_6_FRAME_7_TEXT, BLOCK_6_FRAME_8_TEXT, BLOCK_6_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_7_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_7_FRAME_1_TEXT, BLOCK_7_FRAME_2_TEXT, BLOCK_7_FRAME_3_TEXT, BLOCK_7_FRAME_4_TEXT, BLOCK_7_FRAME_5_TEXT, BLOCK_7_FRAME_6_TEXT, BLOCK_7_FRAME_7_TEXT, BLOCK_7_FRAME_8_TEXT, BLOCK_7_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_8_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_8_FRAME_1_TEXT, BLOCK_8_FRAME_2_TEXT, BLOCK_8_FRAME_3_TEXT, BLOCK_8_FRAME_4_TEXT, BLOCK_8_FRAME_5_TEXT, BLOCK_8_FRAME_6_TEXT, BLOCK_8_FRAME_7_TEXT, BLOCK_8_FRAME_8_TEXT, BLOCK_8_FRAME_9_TEXT};
    public static final JFormattedTextField[] BLOCK_9_ARRAY_TEXT = new JFormattedTextField[] {BLOCK_9_FRAME_1_TEXT, BLOCK_9_FRAME_2_TEXT, BLOCK_9_FRAME_3_TEXT, BLOCK_9_FRAME_4_TEXT, BLOCK_9_FRAME_5_TEXT, BLOCK_9_FRAME_6_TEXT, BLOCK_9_FRAME_7_TEXT, BLOCK_9_FRAME_8_TEXT, BLOCK_9_FRAME_9_TEXT};

    public static final JFormattedTextField[] ALL_BLOCKS_ARRAY_TEXT = new JFormattedTextField[]{
            BLOCK_1_FRAME_1_TEXT, BLOCK_1_FRAME_2_TEXT, BLOCK_1_FRAME_3_TEXT, BLOCK_1_FRAME_4_TEXT, BLOCK_1_FRAME_5_TEXT, BLOCK_1_FRAME_6_TEXT, BLOCK_1_FRAME_7_TEXT, BLOCK_1_FRAME_8_TEXT, BLOCK_1_FRAME_9_TEXT,
            BLOCK_2_FRAME_1_TEXT, BLOCK_2_FRAME_2_TEXT, BLOCK_2_FRAME_3_TEXT, BLOCK_2_FRAME_4_TEXT, BLOCK_2_FRAME_5_TEXT, BLOCK_2_FRAME_6_TEXT, BLOCK_2_FRAME_7_TEXT, BLOCK_2_FRAME_8_TEXT, BLOCK_2_FRAME_9_TEXT,
            BLOCK_3_FRAME_1_TEXT, BLOCK_3_FRAME_2_TEXT, BLOCK_3_FRAME_3_TEXT, BLOCK_3_FRAME_4_TEXT, BLOCK_3_FRAME_5_TEXT, BLOCK_3_FRAME_6_TEXT, BLOCK_3_FRAME_7_TEXT, BLOCK_3_FRAME_8_TEXT, BLOCK_3_FRAME_9_TEXT,
            BLOCK_4_FRAME_1_TEXT, BLOCK_4_FRAME_2_TEXT, BLOCK_4_FRAME_3_TEXT, BLOCK_4_FRAME_4_TEXT, BLOCK_4_FRAME_5_TEXT, BLOCK_4_FRAME_6_TEXT, BLOCK_4_FRAME_7_TEXT, BLOCK_4_FRAME_8_TEXT, BLOCK_4_FRAME_9_TEXT,
            BLOCK_5_FRAME_1_TEXT, BLOCK_5_FRAME_2_TEXT, BLOCK_5_FRAME_3_TEXT, BLOCK_5_FRAME_4_TEXT, BLOCK_5_FRAME_5_TEXT, BLOCK_5_FRAME_6_TEXT, BLOCK_5_FRAME_7_TEXT, BLOCK_5_FRAME_8_TEXT, BLOCK_5_FRAME_9_TEXT,
            BLOCK_6_FRAME_1_TEXT, BLOCK_6_FRAME_2_TEXT, BLOCK_6_FRAME_3_TEXT, BLOCK_6_FRAME_4_TEXT, BLOCK_6_FRAME_5_TEXT, BLOCK_6_FRAME_6_TEXT, BLOCK_6_FRAME_7_TEXT, BLOCK_6_FRAME_8_TEXT, BLOCK_6_FRAME_9_TEXT,
            BLOCK_7_FRAME_1_TEXT, BLOCK_7_FRAME_2_TEXT, BLOCK_7_FRAME_3_TEXT, BLOCK_7_FRAME_4_TEXT, BLOCK_7_FRAME_5_TEXT, BLOCK_7_FRAME_6_TEXT, BLOCK_7_FRAME_7_TEXT, BLOCK_7_FRAME_8_TEXT, BLOCK_7_FRAME_9_TEXT,
            BLOCK_8_FRAME_1_TEXT, BLOCK_8_FRAME_2_TEXT, BLOCK_8_FRAME_3_TEXT, BLOCK_8_FRAME_4_TEXT, BLOCK_8_FRAME_5_TEXT, BLOCK_8_FRAME_6_TEXT, BLOCK_8_FRAME_7_TEXT, BLOCK_8_FRAME_8_TEXT, BLOCK_8_FRAME_9_TEXT,
            BLOCK_9_FRAME_1_TEXT, BLOCK_9_FRAME_2_TEXT, BLOCK_9_FRAME_3_TEXT, BLOCK_9_FRAME_4_TEXT, BLOCK_9_FRAME_5_TEXT, BLOCK_9_FRAME_6_TEXT, BLOCK_9_FRAME_7_TEXT, BLOCK_9_FRAME_8_TEXT, BLOCK_9_FRAME_9_TEXT
    };

    GuiPanels(){
        NUMBER_FORMATTER.setValueClass(Integer.class);
        NUMBER_FORMATTER.setMinimum(1);
        NUMBER_FORMATTER.setMaximum(9);
        NUMBER_FORMATTER.setAllowsInvalid(true);
        NUMBER_FORMATTER.setCommitsOnValidEdit(true);
//        LOSE_TOOLTIP.add(LOSE_TOOLTIP);
    }
}
