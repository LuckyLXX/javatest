/**
 * ClassName:teat2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 15:51
 * @Author:857251389@qq.com
 */
public class teat2 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
    }
    public static void operate(StringBuffer x,StringBuffer y){
        x.append(y);
        y=x;
    }
}
