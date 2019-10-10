import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/10
 */

// 求斐波那契数列的第 N 项
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        int n = scanner.nextInt();
        System.out.println(fib1(n));
        System.out.println(fib2(n));
    }

    // 递归
    public static int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib1(n-1) + fib1(n-2);
    }

    // 非递归
    public  static int fib2(int n) {
        int last2 = 1;
        int last1 = 1;
        int cur = 0;
        for (int i = 3; i <= n; i++) {
            cur = last1 + last2;
            last2 = last1;
            last1 = cur;
        }
        return cur;
    }

}
