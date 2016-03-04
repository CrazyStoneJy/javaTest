package com.crazystone.test;

/**
 * Created by crazystone on 2016/1/24.
 */
public class ReturnTest {

    public static int count = 0;

    public static void main(String[] args) {
        Thread t = runThread();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : stack) {
            sb.append("className:" + element.getClassName() + ",\t");
            sb.append("method name:" + element.getMethodName());
            System.out.println(sb.toString());
        }
    }


    public static Thread runThread() {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                count++;
                System.out.println(">>>>>>>>>>>>1");
                if (count == 1) return;
                System.out.println(">>>>>>>>>>>>>>2");
            }
        }, "haha");
        t.start();

        return t;
    }


}
