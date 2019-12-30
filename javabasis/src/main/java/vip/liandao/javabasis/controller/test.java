package vip.liandao.javabasis.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class test {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(11111);
            Thread.sleep(3600);
        }
    }

    @Scheduled(cron = "*/5 * * * * ?")
    private void aaaaa() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("定时任务，自动执行:" + format.format(new Date()));
    }

}
