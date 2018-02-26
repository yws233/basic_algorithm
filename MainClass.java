/*
*  斐波那契数列
* */
public class MainClass {
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        for (int counter = 0; counter <= 15; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
                    counter, fibonacci(counter));
        }
    }
}
