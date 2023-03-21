package gab.leetcode;

import java.util.Scanner;

public class RecursionFibonacci {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibonacci(input));

    }
    public static int fibonacci(int n){
        if (n <= 1) { // Base case
            return n;
        } else { // Recursive case
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
