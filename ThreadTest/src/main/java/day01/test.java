package day01;

/**
 * @ClassName test
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/10 9:41
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {
        Person xiaoming = new Person();
        xiaoming.name="小明";
        xiaoming.money=200;
        xiaoming.spendmoney=20;

        Person xiaohei = new Person();
        xiaohei.name="小黑";
        xiaohei.money=10;
        xiaohei.spendmoney=5;

        Person xiaohong = new Person();
        xiaohong.name="小红";
        xiaohong.money=130;
        xiaohong.spendmoney=10;

        Person xiaogang = new Person();
        xiaogang.name="小刚";
        xiaogang.money=40;
        xiaogang.spendmoney=10;

        ThreadDemo demo1 = new ThreadDemo(xiaoming,xiaohei);
        demo1.start();
        ThreadDemo demo2 = new ThreadDemo(xiaohong,xiaogang);
        demo2.start();
    }
}
