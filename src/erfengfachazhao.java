import java.io.Serializable;
import java.util.MissingFormatArgumentException;

/**
 * ClassName:erfengfachazhao
 * Package:PACKAGE_NAME
 * Description:二分法查找
 *
 * @Date:2019/10/12 9:36
 * @Author:857251389@qq.com
 */
public class erfengfachazhao {
    public static int search(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (i > arr[mid]) {
                start = mid + 1;
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {

        quicksortdemo qs = new quicksortdemo();
        int[] arr = {2,5,11,3,15,7,84,131};
        qs.quicksort(arr,0,arr.length-1);
        int search = search(arr, 15);

        System.out.println(search);
    }
}
