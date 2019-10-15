package day04;

/**
 * @ClassName test
 * @Description 接口隔离原则
 * @Author 狮源信息-tang
 * @Date 2019/10/14 17:53
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {

        A a =new A();
        a.depend1(new B());

    }

    interface Interface1{
        void operation1();
    }

    interface Interface2{
        void operation2();
        void operation3();
    }

    interface Interface3{
        void operation4();
        void operation5();
    }

    static class B implements Interface1,Interface2{

        @Override
        public void operation1() {
            System.out.println("B 实现了接口1");
        }

        @Override
        public void operation2() {
            System.out.println("B 实现了接口2");
        }

        @Override
        public void operation3() {
            System.out.println("B 实现了接口3");
        }
    }

    class D implements Interface1,Interface3{

        @Override
        public void operation1() {
            System.out.println("D 实现了接口1");
        }

        @Override
        public void operation4() {
            System.out.println("D 实现了接口4");
        }

        @Override
        public void operation5() {
            System.out.println("D 实现了接口5");
        }
    }

    static class A{
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend2(Interface2 i){
            i.operation2();
        }


        public void depend3(Interface2 i){
            i.operation3();
        }
    }

    class C{
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend2(Interface3 i){
            i.operation4();
        }


        public void depend3(Interface3 i){
            i.operation5();
        }
    }
}
