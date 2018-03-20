/*
* 非递归实现斐波那契数列
* */
public class Fibonacci {
    public static int fibonacci(int n){
        if (n <= 1){
            return 1;
        }
        int last = 1;
        int nextToLast = 1;
        int fnum = 1;
        for (int i = 2;i <= n;i++){
            fnum = last + nextToLast;
            nextToLast = last;
            last = fnum;
        }
        return fnum;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++){
            System.out.println(fibonacci(i));
        }
    }
}
