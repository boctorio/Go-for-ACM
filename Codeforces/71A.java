import java.util.Scanner;
import java.util.stream.*;
import java.io.*;
public class Test {

    public static void main(String[] args) {
        int t;
        String str;
        Scanner br = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = br.nextInt();
        for (int i = 0; i < t; i++) {
            str = br.next();
            int len = str.length();
            if (len > 10) {
                System.out.println(str.charAt(0) + "" + (len - 2) + "" + str.charAt(len-1));
            } else {
                System.out.println(str);
            }
        }
    }
}
