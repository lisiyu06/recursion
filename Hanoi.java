import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/10
 */

//汉诺塔问题-----递归
public class Hanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        int n = scanner.nextInt();

        hanoi("a","b","c", n);
    }
    public static void hanoi(String from, String temp, String to, int n) {
        if(n==1) {
            System.out.println("从" + from + "移动盘子 " + n + " 号到" + to);
        } else {
            hanoi(from,to,temp,n-1);
            System.out.println("从" + from + "移动盘子 " + n + " 号到" + to);
            hanoi(temp,from,to,n-1);
        }
    }
}
