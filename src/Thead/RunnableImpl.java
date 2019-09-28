package Thead;

/**
 * ClassName:RunnableImpl
 * Package:Thead
 * Description:
 *
 * @Date:2019/9/24 21:51
 * @Author:857251389@qq.com
 */
public class RunnableImpl implements Runnable {

    private int ticket = 100;

    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (obj){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"-->"+ticket);
                    ticket--;
                }
            }
        }
    }

    public  synchronized void sellTricket(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"-->"+ticket);
            ticket--;
        }
    }
}
