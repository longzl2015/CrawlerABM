package util;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.regex.Pattern;

import static util.StringUtil.decodeUnicode;

/**
 * Created by zl on 2015/8/1.
 */
public class CrawlUtil {

        /***页面下载****************************/
    /**
     * 下载基金源信息
     *
     * @param url
     * @return
     * @throws Exception
     */
    public static String downloadList_without_JS(String url) {
        /**HtmlUnit请求web页面*/
        WebClient wc = new WebClient(BrowserVersion.CHROME);
        wc.getOptions().setJavaScriptEnabled(false); //启用JS解释器，默认为true
        wc.getOptions().setCssEnabled(false); //禁用css支持
        wc.getOptions().setThrowExceptionOnScriptError(false); //js运行错误时，是否抛出异常
        wc.getOptions().setTimeout(10000); //设置连接超时时间 ，这里是10S。如果为0，则无限期等待
        HtmlPage page = null;
        try {
            page = wc.getPage(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Pattern.matches(".*192\\.0\\.0\\.6.*", page.getWebResponse().getContentAsString())) {
            System.out.println("error,连接不上网络");
            System.out.println("error,连接不上网络");
            System.out.println("error,连接不上网络");
        }

        String PageAsText = page.asText();

        wc.close();
        System.out.println(url + "页面下载成功  ");
        return decodeUnicode(PageAsText);
    }
}
