package com.example.test;

import java.util.Scanner;
import java.util.stream.*;
import java.io.*;
public class Test {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n, k, ans=0;
        int[] a = new int[100];
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= a[k-1] && a[i] > 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
