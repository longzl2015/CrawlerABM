package util;

import java.util.List;

/**
 * Created by hadoop on 2015/7/24.
 */
public class ListPrint {

    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void listPrint(List<String> list) {
        for (String s : list) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(LINE_SEPARATOR);
    }
    public static void tablePrint(List<List<String>> table) {
        for (List<String> list : table) {
            for (String s : list) {
                System.out.print(s.toString() + " ");
            }
        }
        System.out.println(LINE_SEPARATOR);
    }
}
