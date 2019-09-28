import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:hashmapdemo
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/9/24 19:04
 * @Author:857251389@qq.com
 */
public class hashmapdemo {

    public static void main(String[] args) {
        //hashmap的遍历
        Map<String,Integer> map = new HashMap<>();

        map.put("lxx",19);
        map.put("zx",16);
        map.put("lsf",23);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = entries.iterator();

        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }

        for(Map.Entry<String,Integer> entry : entries){

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
