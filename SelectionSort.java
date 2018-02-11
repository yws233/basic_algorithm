package sort;
/*
* 选择排序
* */
public class SelectionSort {

    public static void selectionSort(int[] num){
        int len = num.length;
        for (int i = 0; i < len - 1; i++){
            int min = i; //最小元素的位置
            for (int j = i + 1; j < len; j++){ //选出待排序中值最小的位置
                if(num[j] < num[min]){
                    min = j;
                }
            }

            if (min != i){
                int temp = num[min];
                num[min] = num[i];
                num[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {0,23,16,5,9,3,66,102,36,99,66};
        selectionSort(num);
        for (int nums : num){
            System.out.print(nums + "\t");
        }
    }
}
