import java.util.Scanner;

public class JavaMatrix {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        int[][] arr =new int[n+1][n+1];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }}

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
