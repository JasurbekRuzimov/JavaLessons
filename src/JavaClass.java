import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {
        String b;

        Scanner sc= new Scanner(System.in);
        b= sc.nextLine();

      System.out.println(b.length());

       int w= b.charAt(0);
        System.out.println("  "+ w);
    }
}
