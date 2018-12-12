package kuwo.com.mavenlib;

import java.util.HashMap;

/**
 * Created by 袁永超 on 2018/12/10.
 */

public class MyUtils {
    private static int value;
    private static HashMap<String, String> map = new HashMap<String, String>();

    public static boolean getVar() {
        addMap();
        return true;
    }

    private static int getInt() {
        return value;
    }

    private static void addMap() {
        map.put("aa", "aa");
    }
}
