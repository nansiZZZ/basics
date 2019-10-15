package day03;

/**
 * @ClassName Proxy
 * @Description 作用描述
 * @Author 狮源信息-tang
 * @Date 2019/10/12 10:44
 * @Version 1.0
 */
public class ProxyDemo {

    public static void main(String[] args) {
        cousumer(new TargetObject());
        cousumer(new SimpleProxy(new TargetObject()));
    }

    public static void cousumer(Interface inter) {
        inter.doSomething();
        inter.somethingElse("tanmu");
    }

    interface Interface{
        //抽象主题对象
        void doSomething();
        void somethingElse(String arg);
    }

    static class TargetObject implements Interface{

        @Override
        public void doSomething() {
            System.out.println("target dosomething");
        }

        @Override
        public void somethingElse(String arg) {
            System.out.println("target somethingElse" + arg);
        }
    }

    static class SimpleProxy implements Interface{

        private Interface target;

        public SimpleProxy(Interface target){
            this.target = target;
        }
        @Override
        public void doSomething() {
            System.out.println("SimpleProxy dosomething");
            target.doSomething();
        }

        @Override
        public void somethingElse(String arg) {
            System.out.println("SimpleProxy somethinngElse" + arg);
            target.somethingElse(arg);
        }
    }
}
