package day01;

/**
 * @ClassName person
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/10 9:30
 * @Version 1.0
 */
public class Person {

    public String name;
    public int money;
    public int spendmoney;

    public void spend(Person person){
        try {
            ThreadDemo.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money-=spendmoney;
        System.out.println(name+"正在给"+person.name+"转钱:"+spendmoney);
        System.out.println(name+"余额:"+money);
        person.money+=spendmoney;
        System.out.println(person.name+"余额:"+person.money);
        if (money<= spendmoney && money == 0){
            System.out.println(name+"没钱了");
        }
    }
}
