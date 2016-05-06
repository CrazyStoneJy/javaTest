package com.crazystone.test.io;

import java.io.*;
import java.util.Date;

/**
 * Created by e on 2016/5/5.
 */
public class FileTest {

    public static void main(String[] args) {

        File file = new File("D://buyer.csv");

        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            fis = new FileInputStream(file);
            reader = new InputStreamReader(fis);
            bufferedReader = new BufferedReader(reader);
            String content = "";//读取csv文件的每一行数据
            //先读取一行，读取标题文字
            String str = bufferedReader.readLine();
            System.out.println("str:" + str);
            while ((content = bufferedReader.readLine()) != null) {
                System.out.println("content:" + content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (reader != null) {
                    reader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
