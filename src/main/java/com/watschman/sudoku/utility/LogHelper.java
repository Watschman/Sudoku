package main.java.com.watschman.sudoku.utility;

public class LogHelper {
    public static void log(String logLevel, Object object){
        System.out.println(logLevel + String.valueOf(object));
    }

    public static void info(Object object) {
        log("[INFO] ", object);
    }

    public static void fatal(Object object) {
        log("[FATAL] ", object);
    }

}
