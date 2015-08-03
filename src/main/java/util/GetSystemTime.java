package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hadoop on 2015/7/23.
 */

public class GetSystemTime {


    public static String getSystemTime() {
        SimpleDateFormat bartDateFormat = new SimpleDateFormat
                ("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return new String((bartDateFormat.format(date)));


    }
}
