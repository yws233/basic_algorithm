package sort;
/*
* 希尔排序
* */
public class ShellSort {

    public static void shellSort(int[] num){
        int len = num.length;
        int j = 0;
        for (int distence = len / 2; distence > 0; distence/=2){ //增量序列
            for (int i = distence; i < len; i++){ //从1开始，第0个数无需比较，第一个
                int temp = num[i]; //插入下一个数
                for (j = i; (j > 0) && (num[j-distence]) > temp; j--){
                    num[j] = num[j - distence]; //移出空位
                }
                num[j] = temp; //插入新数
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {0,23,16,5,9,3,66,102,36,99,66};
        shellSort(num);
        for (int nums : num){
            System.out.print(nums + "\t");
        }
    }
}
