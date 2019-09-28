package Thead;

/**
 * ClassName:hashmapdemo2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 19:16
 * @Author:857251389@qq.com
 */
public class TheadDemo {
    public static void main(String[] args) {

        Runnable r0 =new RunnableImpl();

        Thread t0 = new Thread(r0);
        Thread t1 = new Thread(r0);
        Thread t2 = new Thread(r0);

        t0.start();
        t1.start();
        t2.start();
    }


}
