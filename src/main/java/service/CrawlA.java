package service;

import dao.FundDaoImpl;
import domain.FundA;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.CrawlUtil.downloadList_without_JS;
import static util.FileUtil.readProperties;
import static util.FileUtil.write2AllProperties;

/**
 * Created by zl on 2015/8/1.
 */
public class CrawlA {

    private static Map<String, String> map = new Hashtable<String, String>();

    private final int fundID_index = 11;

    private String url = "http://www.jisilu.cn/data/sfnew/funda_list/?___t=";
    private File fileTemp = new File("");

    public CrawlA(File fileTemp) {

        this.fileTemp = fileTemp;
        map = readProperties(fileTemp);
    }

    public void crawl(Date currentDate) {

        Long time_long = currentDate.getTime();

        String timeFormat = null;
        SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeFormat = bartDateFormat.format(currentDate);

        String text = downloadList_without_JS(url + time_long);
        parsePage(text, timeFormat);
    }

    public void parsePage(String text, String timeFormat) {

        FundDaoImpl fundDao = new FundDaoImpl();
        FundA fund = new FundA();

        int count = 0;

        Pattern pattern = Pattern.compile("cell\":\\{" + "([^}]*)" + "}}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String temp = matcher.group(1)
                    .replaceAll("\"", "");

            String[] str = temp.split(",");

            List<String> list1 = new ArrayList<String>();

            Pattern pattern1 = Pattern.compile(":(.*)");
            for (String s : str) {//遍历每一个属性
                Matcher matcher1 = pattern1.matcher(s);
                while (matcher1.find()) {
                    if (!matcher1.group().equals(":")) {
                        list1.add(matcher1.group().substring(1, matcher1.group().length()));
                    } else {
                        list1.add("空");
                    }
                }
            }

            boolean b = false;
            String id = list1.get(fundID_index);

            if (map.containsKey(id)) {
                if (map.get(id).equals(list1.toString())) {
                    b = false;
                } else b = true;
            } else {
                b = true;
            }

            if (b) {
                fund.setAllValue(list1);
                count += fundDao.addFund(fund, timeFormat);
                map.put(id, list1.toString());
                System.out.println("A类：更改条目"+id+"=="+list1.toString());
            }
        }
        if (count>0){
        System.out.println("解析A类基金页面中...... 共成功得到记录：" + count);
        write2AllProperties(fileTemp, map, false);
        }

    }

    public static void main(String[] args) {
        CrawlA crawlA = new CrawlA(new File("tempFile"+System.getProperty("file.separator")+"tableA_temp.properties"));
        crawlA.crawl(new Date());
    }
}
