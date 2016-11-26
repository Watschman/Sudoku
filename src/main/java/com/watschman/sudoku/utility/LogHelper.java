package main.java.com.watschman.sudoku.utility;

/**
 * Created by Steve on 26.11.2016.
 */
public class LogHelper {
    public static void log(String logLevel, Object object){
        System.out.println(logLevel + String.valueOf(object));
    }
    public static void all(Object object){ log("[ALL] ", object); }

    public static void info(Object object) {
        log("[INFO] ", object);
    }

    public static void warn(Object object) {
        log("[WARNING] ", object);
    }

    public static void error(Object object) {
        log("[ERROR] ", object);
    }

    public static void fatal(Object object) {
        log("[FATAL] ", object);
    }

    public static void off(Object object) {
        log("[OFF] ", object);
    }
}
