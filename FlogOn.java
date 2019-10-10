import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/10
 */

// 青蛙跳台阶问题(递归)
// 求该青蛙跳上一个n 级的台阶总共有多少种跳法
public class FlogOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int n = scanner.nextInt();
        System.out.println(flogOn1(n));
        System.out.println(flogOn2(n));
    }

    // 1. 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。
    public static int flogOn1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return flogOn1(n - 1) + flogOn1(n - 2);
    }

    // 2. 一只青蛙跳台阶，一次可以跳1阶，可以2阶，其能力足够强大以至于一次可以跳n阶
    public static int flogOn2(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * flogOn2(n - 1);
    }

}
