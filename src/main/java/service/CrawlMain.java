package service;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * Created by hadoop on 2015/7/21.
 */
public class CrawlMain {

    private ScheduledExecutorService scheduExec = Executors.newScheduledThreadPool(3);

    private static String[] tempFile = {
            "tempFile" + System.getProperty("file.separator") + "tableA_temp.properties",
            "tempFile" + System.getProperty("file.separator") + "tableB_temp.properties",
            "tempFile" + System.getProperty("file.separator") + "tableM_temp.properties"
    };

    public static void main(String[] args) {

//        CrawlA crawlA = new CrawlA(new File(tempFile[0]));
//        crawlA.crawl(new Date());
//
//        CrawlB crawlB = new CrawlB(new File(tempFile[1]));
//        crawlB.crawl(new Date());
//
//        CrawlM crawlM = new CrawlM(new File(tempFile[2]));
//        crawlM.crawl(new Date());

        new CrawlMain().crawlerABMForTiming(10);
    }


    public void crawlerABMForTiming(int seconds) {
        Runnable crawlerABM = new Runnable() {
            public void run() {

               // CrawlA crawlA = new CrawlA(new File(tempFile[0]));
                //crawlA.crawl(new Date());

              //  CrawlB crawlB = new CrawlB(new File(tempFile[1]));
              //  crawlB.crawl(new Date());

                CrawlM crawlM = new CrawlM(new File(tempFile[2]));
                crawlM.crawl(new Date());
            }
        };
        scheduExec.scheduleAtFixedRate(crawlerABM, 0, seconds, TimeUnit.SECONDS);
    }

    public void crawlerAForTiming(int seconds) {
        Runnable crawlerABM = new Runnable() {
            public void run() {

                CrawlA crawlA = new CrawlA(new File(tempFile[0]));
                crawlA.crawl(new Date());

                CrawlB crawlB = new CrawlB(new File(tempFile[1]));
                crawlB.crawl(new Date());

                CrawlM crawlM = new CrawlM(new File(tempFile[2]));
                crawlM.crawl(new Date());
            }
        };
        scheduExec.scheduleAtFixedRate(crawlerABM, 0, seconds, TimeUnit.SECONDS);
    }

    public void crawlerBForTiming(int seconds) {
        Runnable crawlerABM = new Runnable() {
            public void run() {

                CrawlA crawlA = new CrawlA(new File(tempFile[0]));
                crawlA.crawl(new Date());

                CrawlB crawlB = new CrawlB(new File(tempFile[1]));
                crawlB.crawl(new Date());

                CrawlM crawlM = new CrawlM(new File(tempFile[2]));
                crawlM.crawl(new Date());
            }
        };
        scheduExec.scheduleAtFixedRate(crawlerABM, 0, seconds, TimeUnit.SECONDS);
    }

    public void crawlerMForTiming(int seconds) {
        Runnable crawlerABM = new Runnable() {
            public void run() {

                CrawlA crawlA = new CrawlA(new File(tempFile[0]));
                crawlA.crawl(new Date());

                CrawlB crawlB = new CrawlB(new File(tempFile[1]));
                crawlB.crawl(new Date());

                CrawlM crawlM = new CrawlM(new File(tempFile[2]));
                crawlM.crawl(new Date());
            }
        };
        scheduExec.scheduleAtFixedRate(crawlerABM, 0, seconds, TimeUnit.SECONDS);
    }
}



