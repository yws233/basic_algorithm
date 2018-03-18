/*
* 折半查找法
* */
public class BinarySearch {
    public static int binarySearch(int[] arr, int a){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] < a){
                low = mid + 1;
            }else if (arr[mid] > a){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1; //未找到
    }

    public static void main(String[] args) {
        int[] num = {1,9,2,9,0,3,0,9,8,6,1,2,3};
        int a = 6;
        System.out.println(a + "的位置为：" + binarySearch(num,a));
    }
}
