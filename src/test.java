import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * ClassName:test
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/5 23:04
 * @Author:857251389@qq.com
 */
public class test {
    @Test
    public void test1(){
        Jedis jedis = new Jedis();
        jedis.hset("user","name","lxx");
        String name = jedis.hget("user", "name");
        System.out.println(name);
    }
    @Test
    public void test2(){
        int he=0;
        for(int i=1;i<=3;i++){
            he=he+i;
        }
        System.out.println(he);
    }
}

