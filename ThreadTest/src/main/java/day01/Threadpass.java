package day01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @ClassName Threadpass
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/10 10:22
 * @Version 1.0
 */
public class Threadpass {

    public static void main(String[] args) {
        Random random = new Random();
        int password=random.nextInt(999);
        Queue<Integer> q=new LinkedList<>();
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("密码是:"+password);
                int pass = 0;
                while (password != pass){
                    pass = random.nextInt(999);
                    if (pass == password){
                        q.offer(pass);
                        break;
                    }
                    q.offer(pass);
                }
            }
        };

        Thread t2 = new Thread(){
          public void run(){
              while(true){
                  if (q.isEmpty()){
                      try {
                          Thread.sleep(1000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }else {
                      Integer temp = q.peek();
                      if(temp != password){
                          System.out.println("正在匹配:"+temp);
                          q.poll();
                      }else {
                          break;
                      }
                  }
              }
          }
        };
        t1.start();
        t2.setDaemon(true);
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正确的密码是"+((LinkedList<Integer>) q).peekFirst());
    }
}
