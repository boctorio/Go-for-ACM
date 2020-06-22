import java.util.Scanner;
import java.util.stream.*;
import java.io.*;
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,a,b,c;
        n = sc.nextInt();

        int solution = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a + b + c >= 2) solution++;
        }
        System.out.println(solution);
    }
}
