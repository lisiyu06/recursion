import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/14
 */

// 写一个递归方法，输入一个非负整数，返回组成它的数字之和.
public class AddBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int n = scanner.nextInt();
        System.out.println(addBy(n));
    }

    public static int addBy(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + addBy(n / 10);
    }
}
