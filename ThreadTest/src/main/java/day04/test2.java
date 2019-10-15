package day04;

/**
 * @ClassName test2
 * @Description 依赖倒置原则
 * @Author 狮源信息-tang
 * @Date 2019/10/15 10:25
 * @Version 1.0
 */
public class test2 {

    public static void main(String[] args) {

        Person person = new Person();
        person.getMessage(new QQ());
        person.getMessage(new Email());

    }

    interface Message{
        public String getInfo();
    }

    static class Email implements Message{

        @Override
        public String getInfo() {
            return "电子邮件消息。。。";
        }
    }

    static class QQ implements Message{

        @Override
        public String getInfo() {
            return "QQ消息";
        }
    }

    static class Person{
        public void getMessage(Message message){
            System.out.println(message.getInfo());
        }
    }
}
