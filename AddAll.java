import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/14
 */

// 递归求 1 + 2 + 3 + ... + 10
public class AddAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int n = scanner.nextInt();
        System.out.println(addAll(n));
    }

    public static int addAll(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addAll(n - 1);
    }
}
