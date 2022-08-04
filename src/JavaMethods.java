import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d;
        d = sc.nextLine();
        text(d);
    }

    public static void text(String d) {
        String s = d.toUpperCase();
        String y = d.toLowerCase();

        System.out.println(s);
        System.out.println(y);

    }


}
