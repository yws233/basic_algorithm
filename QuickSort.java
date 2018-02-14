package sort;
/*
* 快速排序
* */
public class QuickSort {

    /*
    * privot "基准"，partition分区, recursive递归
    * */

    public static void quickSort(int[] num){
        quickSort(num, 0, num.length - 1);
    }

    public static void quickSort(int[] num, int left, int right){
        int middle = 0;
        if (left < right){
            middle = partition(num, left, right);
            quickSort(num, left, middle - 1); //左边排序
            quickSort(num, middle + 1, right); //右边排序
        }
    }
    // 分区
    private static int partition(int[] num, int left, int right){

        int povit = num[left]; //选取左边的元素为基准值
        while (left < right){
            while (left < right && num[right] > povit){
                right--;
            }
            if (left < right){
                num[left++] = num[right];
            }

            while (left < right && num[left] <= povit){
                left++;
            }
            if (left < right){
                num[right--] = num[left];
            }
        }
        num[left] = povit; //返回基准值
        return left;
    }

    public static void main(String[] args) {
        int[] num = {0,23,16,5,9,3,66,102,36,99,66};
        quickSort(num);
        for (int nums : num){
            System.out.print(nums + "\t");
        }
    }
}
