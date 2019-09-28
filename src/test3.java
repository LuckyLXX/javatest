/**
 * ClassName:test3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 16:50
 * @Author:857251389@qq.com
 */

/**
 * 父类静态成员（包括方法和变量，按顺序初始化）
 * 子类静态成员（包括方法和变量，按顺序初始化）
 * 父类成员变量（包括非静态代码块）
 * 父类构造方法
 * 子类成员变量（包括非静态代码块）
 * 子类构造方法
 */
public class test3 {
    static class Shape {
        Shape(int i) {
            System.out.println("This is Shape" + i);
        }
    }
    public static class Circle extends Shape {
        static Shape s1 = new Shape(1);
        Shape s2 = new Shape(3);
        Circle(int i) {
            super(i);
            System.out.println("This is Circle" + i);
        }

        public static void main(String args[]) {
            Circle c1 = new Circle(2);
//            int[] a ={1,2,3};
////            String a = "adad";
//            System.out.println(a.length);
        }
    }
}
