/**
 * ClassName:test2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 15:31
 * @Author:857251389@qq.com
 */
public class test2 {

//    static class Foo {
//        public int i = 3;
//
//    }
    static class A{

        public int get(int a){
            return a+1;
        }
    }

    static class B extends A{
        public int get(int a,char c){
            return a+2;
        }
    }

    public static void main(String[] args) {
//        Object o =(Object) new Foo();
//        Foo foo =(Foo) o;
//        System.out.println(foo.i);
//

//        int index =1;
//        String[] test = new String[3];
//        String foo =test[index];
//        System.out.println(foo);

        B b = new B();
        System.out.println(b.get(0));
    }
}
