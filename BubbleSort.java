package sort;
/*
* 冒泡排序
* */
public class BubbleSort {

   public static void bubbleSort(int[] num){
       int temp = 0;
       int len = num.length;
       for (int i = len - 1; i >= 0; i--){ //外层循环，0开始，i < len - 1
            int flag = 0;  //设置标识符号，看数组是否已经排序好
           for (int j = 0; j < i; j++){ //一趟排序
                if (num[j] > num[j + 1]){ //进行交换
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = 1;
                }
           }

           if (flag == 0){ //如果flag = 0,则代表数组是有序的,跳出排序
               break;
           }

       }
   }

    public static void main(String[] args) {
        int[] num = {0,23,16,5,9,3,66,102,36,99,66};
        bubbleSort(num);
        for (int nums : num){
            System.out.print(nums + "\t");
        }
    }

}
