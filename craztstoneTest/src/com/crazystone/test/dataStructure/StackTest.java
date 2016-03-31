package com.crazystone.test.dataStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 用stack来判断表达式中的(),[],{}是否对应
 * Created by crazystone on 2016/3/31.
 */
public class StackTest {

    public static void main(String[] args) {

        try {
            File file = new File("d://AppointmentActivity.java");
            FileInputStream fis = new FileInputStream(file);
            byte[] buff = new byte[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            try {
                while ((len = (fis.read(buff))) > 0) {
                    sb.append(new String(buff, 0, len));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print(isMatch(sb.toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * [],{},()匹配  思路：
     *
     * @param orignalStr
     * @return
     */
    public static boolean isMatch(String orignalStr) {
        boolean isEnd = true;
        StringTokenizer tokenizer = new StringTokenizer(orignalStr, "()[]{}", true);
        Stack<String> stack = new Stack<String>();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            System.out.println(token);

            if (token == null) continue;
            else {
                if ("(".equals(token)) {
                    stack.push(")");
                } else if ("[".equals(token)) {
                    stack.push("]");
                } else if ("{".equals(token)) {
                    stack.push("}");
                } else if (")".equals(token) || "}".equals(token) || "]".equals(token)) {
                    if (!stack.isEmpty()) {
                        String afterToken = stack.pop();
                        if (!afterToken.equals(token)) {
                            isEnd = false;
                        }
                    }
                }
            }
        }
        return isEnd;
    }


}
