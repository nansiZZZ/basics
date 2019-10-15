package day04;

/**
 * @ClassName test1
 * @Description 单一职责原则
 * @Author 狮源信息-tang
 * @Date 2019/10/14 18:11
 * @Version 1.0
 */
public class test1 {

    public static void main(String[] args) {

        App a = new App();
        a.iphoneRun("QQ");
        a.ipadRun("weixin");
        a.computerRun("LOL");

    }

    static class App{
        public void computerRun(String app){
            System.out.println(app + "正在电脑上运行");
        }

        public void iphoneRun(String app){
            System.out.println(app + "正在手机上运行");
        }

        public void ipadRun(String app){
            System.out.println(app + "正在平板上运行");
        }
    }
}
