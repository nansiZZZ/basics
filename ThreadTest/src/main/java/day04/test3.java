package day04;

/**
 * @ClassName test3
 * @Description 里氏替换原则
 * @Author 狮源信息-tang
 * @Date 2019/10/15 10:52
 * @Version 1.0
 */
public class test3 {

    public static void main(String[] args) {

        A a =new A();
        System.out.println("11-4="+a.func1(11,4));
        B b = new B();
        System.out.println("2+52="+b.func1(2,52));
        System.out.println("2+52+9="+b.func2(2,52));
        System.out.println("31-13="+b.func3(31,13));

    }

    static class Base{

    }

    static class A extends Base{
        public int func1(int a,int b){
            return a-b;
        }
    }

    static class B extends Base{

        private A a = new A();

        public int func1(int a,int b){
            return a+b;
        }

        public int func2(int a,int b){
            return (a+b)+9;
        }

        public int func3(int a,int b){
            return this.a.func1(a,b);
        }
    }
}
