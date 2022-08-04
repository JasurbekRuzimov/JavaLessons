import java.util.Scanner;

public class PolindromSonlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        isPalindrome(a);
    }

    public static void isPalindrome(int a) {
        int summ = 0, b;
        while (a != 0) {
            b = a % 10;
            a = a / 10;
            summ = (summ * 10) + b;
        }
        System.out.println(summ);

    }
}
// Bu dastur xohlagan bir sonning teskari yozilishini topib beradi;