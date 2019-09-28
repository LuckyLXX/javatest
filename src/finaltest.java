import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ClassName:finaltest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/23 22:13
 * @Author:857251389@qq.com
 */
public class finaltest {

    static class A {

        int i = 10;

//        public A() {
//            System.out.println(this);
//        }

        public void print1() {
            System.out.println("这是父类");
        }
    }

    static class B extends A {
        int i = 20;
        public void print1(){
            System.out.println("这是子类");
        }
    }

    public static void main(String[] args) {
        /*
         *
         *  final修饰引用类型时成员变量的值可以修改，但成员的地址不变
        final A a = new A();
        a.i = 19;
        System.out.println(a);
         */
        /*

        多态实现的对象a的成员变量的值会使用父类的,但调用的方法如果子类重写了，使用子类，如果没有就去父类找。
        A a = new B();
        a.print1();
        System.out.println(a.i);
         */

//        ArrayList<String> strings = new ArrayList<>();
//
//        Collections.addAll(strings,"a","b","c");
//
//        Collections.shuffle(strings);
//        System.out.println(strings);



//        byte b =257;
//
//        boolean d = null;
//
//        int i =10;


    }
}
