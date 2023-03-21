package gab.leetcode;

import java.util.Scanner;

public class GCDRecursion {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println(gcd(input,input2));

    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return (gcd(b, a%b));
        }
    }
}
