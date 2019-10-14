import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/14
 */

// 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
public class PrintBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int n = scanner.nextInt();
        printBy(n);
    }

    public static void printBy(int n) {
        if (n > 10) {
            printBy(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
}
