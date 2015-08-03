package util;

import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hadoop on 2015/7/22.
 */
public class FileUtil {

    /**
     * 将信息写到 "tempFile\\outPut.txt" 文件中
     *
     * @param inPutText    要写入文件的字符串
     * @param OutPath      输出路径
     * @param delExistFile true 若文件已存在，删除之。
     * @throws RuntimeException
     */
    public static void write2File(String inPutText, String OutPath, boolean delExistFile) throws RuntimeException {

        if (delExistFile) {
            File fileTXT = new File("tempFile" + "\\" + OutPath + ".txt");
            if (fileTXT.exists()) {
                fileTXT.delete();
            }
        }

        File f = new File("tempFile");
        if (!f.exists()) {
            f.mkdir();
        }
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(f + "\\" + OutPath + ".txt", true);//实现续写
            BufferedOutputStream bufos = new BufferedOutputStream(fos);
            bufos.write((inPutText + "\n").getBytes());
            bufos.flush();
            //没有加bufos.flush(); 导致文件内容空白。
        } catch (IOException e) {
            System.out.println(e.toString() + "====================");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException("+++++++++++++" + e);
                }
            }
        }
    }

    /**
     * 删除文件夹下的所有文件
     *
     * @param dirPath 待删除的文件夹
     */
    public static void deleteDir(File dirPath) {

        File[] files = dirPath.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDir(file);
                } else {
                    System.out.println(file + "=====" + file.delete());
                }
            }
            System.out.println(dirPath + "=====" + dirPath.delete());
        }
    }

    // 写入properties信息

    /**
     * 写入单条property信息
     *
     *
     * @param file
     * @param parameterName
     * @param parameterValue
     */

    public static void writeProperties(File file, String parameterName,
                                       String parameterValue) {
        Properties prop = new Properties();
        try {
            InputStream fis = new FileInputStream(file);
            // 从输入流中读取属性列表（键和元素对）
            prop.load(fis);
            // 调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。
            // 强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
            OutputStream fos = new FileOutputStream(file);
            // 调用 Hashtable 的方法 put。
            prop.setProperty(parameterName, parameterValue);
            // 以适合使用 load 方法加载到 Properties 表中的格式，
            // 将此 Properties 表中的属性列表（键和元素对）写入输出流
            prop.store(fos, "Update '" + parameterName + "' value");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 将信息批量写入properties信息
     *
     * @param outfile
     * @param map
     * @param b       true:实现续写
     */
    public static void write2AllProperties(File outfile, Map<String, String> map, boolean b) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        Properties properties = new Properties();
        try {
            if (b) {
                // 将文件读入流
                fis = new FileInputStream(outfile);
                // 加载文件
                properties.load(fis);
            }
            // 准备写入流
            fos = new FileOutputStream(outfile);
            // 将信息放入Properites
            properties.putAll(map);
            // 保存此Properites
            properties.store(fos, "更新最近列表");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(fos);
        }

    }


    /**
     * 读取properties的全部信息
     *
     * @param file
     * @return
     */
    public static Map<String, String> readProperties(File file) {

        Properties props = new Properties();
        Map<String, String> map = new Hashtable<String, String>();
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            props.load(in);
            // 返回属性列表中所有键的枚举，如果在主属性列表中未找到同名的键，则包括默认属性列表中不同的键。
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = props.getProperty(key);
                map.put(key, value);
            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException("FileNotFoundException error");
        } catch (IOException e) {
            throw new RuntimeException("error");
        } finally {
            closeStream(in);
        }

        return map;
    }

    public static void closeStream(Closeable c) {
        try {
            if (c != null) c.close();
        } catch (IOException e) {
            throw new RuntimeException("关闭IO流失败");
        }
    }
}
