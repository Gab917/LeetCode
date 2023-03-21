package gab.leetcode;


import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(convertPigLatin(input));

    }

    public static String convertPigLatin(String s){
        String result = "";
        for (int i = 0; i <= s.length()-1; i++){
            if(isVowel(s.charAt(i))){
                if(i == 0){
                return s + "yay";
                }
                else
                return s.substring(i,s.length()) + s.substring(0,i) + "ay";
            }
        }
        return s;



    }

    public static boolean isVowel(char c){
        switch (c){
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }

    }
}
