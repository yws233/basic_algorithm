package sort;
/*
* 插入排序
* */
public class InsertionSort {

    public static void insertSort(int[] num){
        int len = num.length;
        int j = 0;
        for (int i = 1; i < len; i++){ //从1开始，第0个数无需比较，第一个
            int temp = num[i]; //插入下一个数
            for (j = i; (j > 0) && (num[j-1]) > temp; j--){
                num[j] = num[j - 1]; //移出空位
            }
            num[j] = temp; //插入新数
        }
    }

    public static void main(String[] args) {
        int[] num = {0,23,16,5,9,3,66,102,36,99,66};
        insertSort(num);
        for (int nums : num){
            System.out.print(nums + "\t");
        }
    }
}
