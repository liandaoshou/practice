package vip.liandao.javabasis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class UseThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();


        MyCallable callable = new MyCallable();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future f = executor.submit(callable);
        System.out.println("提交任务之后，获取结果之前 " + getStringDate());
        System.out.println("获取返回值: " + f.get());
        System.out.println("获取到结果之后 " + getStringDate());
    }

    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("run2");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("run1");
    }
}

class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        Thread.sleep(3000);
        return "call1";
    }
}