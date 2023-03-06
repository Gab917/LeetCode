package gab.leetcode;

public class RemoveVowel {
    /*
       Problem: Write a Java program that takes a string as input and returns a new string where all the vowels in the original string are removed.

        Example:
        Input: "Hello, World!"
        Output: "Hll, Wrld!"
     */
    public static void main(String[] args){
        System.out.println(removeVowel("Hello World!"));
    }


    public static String removeVowel(String s){ //O(n) runtime
        String result = "";
        StringBuilder resultsb = new StringBuilder();
        for(int i = 0; i <= s.length()-1;i++){ //Iterates thru all the indexes in array String
            if(!isVowel(s.charAt(i))){ //Uses helper method to determine if character at index is a vowel
                //result += s.charAt(i); //Adds character to new string result
                resultsb.append(s.charAt(i));
            }

        }
        return resultsb.toString();
    }

    public static boolean isVowel(char c){
        switch(c){
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
