package day01;

/**
 * @ClassName Thread
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/10 10:00
 * @Version 1.0
 */
public class ThreadDemo extends Thread {

    private Person p1;
    private Person p2;

    public ThreadDemo(Person p1,Person p2){
        this.p1=p1;
        this.p2=p2;
    }

    public void run(){
        while (p1.money>=p1.spendmoney){
            p1.spend(p2);
        }
    }
}
