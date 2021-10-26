package com.zlq.lo.entry;
//写一个通用的copy(String 原始路径,String 新路径)，能复制所有文件，
//且名字和后缀名与源文件一致，在名字前拼接当前日期
//使用Scanner写入路径
//例如:
//请输入源文件路径：
//D:\soft\a.txt
//请输入文件保存的路径
//F:\abc\zuoYe
//新文件保存的类型为:2015_08_27_999_a.txt;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class copy implements Serializable {
    public static void copyFile(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        if (!oldFile.exists()) {        //判断是否存在
            System.out.println("输入文件路径不正确");
            return;
        }

        File newFile = new File(newPath);
        if (!newFile.exists()) {
            newFile.mkdirs();
        } else {
            System.out.println("输入路径错误");
        }

        SimpleDateFormat time = new SimpleDateFormat("yyyy_MM_dd_HH_");
        String dateTime = time.format(new Date());
        String newName = (dateTime + newFile);//getName返回由此抽象路径名表示的文件或目录的名称。


        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(oldFile);
            fw = new FileWriter(newName);
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(len);
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
