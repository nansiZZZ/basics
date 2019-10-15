package day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Iodemo1
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/10 14:58
 * @Version 1.0
 */
public class Iodemo1 {

    public static void main(String[] args) {
/*        File f1 = new File("d:/LOL");
        System.out.println("f1的绝对路径为:"+f1.getAbsolutePath());

        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());

        File f3 = new File(f1,"LOL.exe");
        System.out.println("f3的绝对路径:"+f3.getAbsolutePath());
*/
/*

        File f = new File("d:/LOL/LOL.exe");

        System.out.println("当前文件"+f);
        System.out.println("是否存在"+f.exists());
        System.out.println("是否为文件夹"+f.isDirectory());
        System.out.println("是否为文件"+f.isFile());
        System.out.println("获取长度"+f.length());

        long time = f.lastModified();
        Date date = new Date(time);
        System.out.println("最后修改时间为"+date);
        File f2 = new File("d:/LOL/DODA.exe");
        f.renameTo(f2);
*/
/*        File f = new File("c:\\WINDOWS");
        System.out.println(f.listFiles());

        File[] cs = f.listFiles();
        for (File each:cs) {
            if (each.isDirectory()){
                continue;
            }
            System.out.println(each+"-------"+each.length());
        }
 */
        try {
            File file = new File("d:/LOL/LOL.txt");
            FileInputStream fis = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
