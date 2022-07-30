import java.util.Scanner;

public class JavaMethods {
    public static void text(String d){
        int q=d.indexOf(0);
        String s=d.toUpperCase();
        String y=d.toLowerCase();

        System.out.println(s);
        System.out.println(y);
        System.out.println(q);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String d= sc.nextLine();
           text(d);
    }


}
