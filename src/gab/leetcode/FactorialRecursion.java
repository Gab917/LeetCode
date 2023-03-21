package gab.leetcode;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(factorial(input));

    }

    public static int factorial(int n){

        if(n == 0 || n == 1)
            return 1;
        else if (n < 0)
            throw new IllegalArgumentException("n must be positive");

        return n * factorial(n-1);
    }

}
