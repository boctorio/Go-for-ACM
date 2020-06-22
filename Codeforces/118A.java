import java.util.Scanner;
import java.util.stream.*;
import java.io.*;
public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        String check = "aeiouy";
        s = sc.next();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i);
            if ('A' <= x && x <= 'Z') {
                x += 32;
            }
            boolean flag = false;
            for (int j = 0; j < 6; j++) {
                if (x == check.charAt(j)) {
                    flag = true;
                }
            }
            if (flag) {
                continue;
            }
            System.out.print("." + x);
        }
    }
}
