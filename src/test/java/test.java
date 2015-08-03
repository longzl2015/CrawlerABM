import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zl on 2015/7/31.
 */
public class test {

    public static void tablePrint(List<List<String>> table) {
        for (List<String> list : table) {
            for (String s : list) {
                System.out.print(s.toString() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

//        List<List<String>> table = new ArrayList<List<String>>();
//
//        for (int x = 0; x < 10; x++) {
//            List<String> list = new ArrayList<String>();
//            for (int i = 0; i < 10; i++)
//
//                list.add(String.valueOf(i));
//            table.add(list);
//        }
//        System.out.println("=============");
//        tablePrint(table);


        FileOutputStream fileOutputStream =null;
        fileOutputStream = new FileOutputStream("src\\tasd");
        String string = "dddd";
        fileOutputStream.write(string.getBytes());
        System.out.println("===============");



    }


}
