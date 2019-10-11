
import java.util.Scanner;

/**
 * ClassName:hannuotademo
 * Package:PACKAGE_NAME
 * Description:汉诺塔题解
 *
 * @Date:2019/10/11 15:44
 * @Author:857251389@qq.com
 */
public class hannuotademo {

    public static void main(String[] args) {

        int N;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        move(N,'A','B','C');


    }

    public static void move(int n, char A, char B, char C){
        if(n==0) return;
        if (n==1){
           System.out.println(A+"----->"+C);
        }
        else{
            move(n-1,A,C,B);
            System.out.println(A+"----->"+C);
            move(n-1,B,A,C);
        }
    }
}
