/**
 * ClassName:quicksortdemo
 * Package:PACKAGE_NAME
 * Description:快速排序算法
 *
 * @Date:2019/10/11 16:30
 * @Author:857251389@qq.com
 */
public class quicksortdemo {


    public static void quicksort(int arr[], int low, int high) {

        int t;//交换中间数
        if(low>high){
            return;
        }


        int temp = arr[low];//基准数

        int i = low;//哨兵i

        int j = high;//哨兵j

        while (i < j) {

            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >=arr[i] && i < j) {
                i++;
            }

            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //将基准数与i j相等的数交换
        arr[low] = arr[i];

        arr[i] = temp;

        quicksort(arr, low, j - 1);

        quicksort(arr, j + 1, high);
    }

    public static void main(String[] args) {
        int[] arr={2,4,52,1,3,8,2,4,78,1,4,42};
        quicksort(arr,0,arr.length-1);
       for(int i : arr){
           System.out.print(i+",");
       }
    }
}
