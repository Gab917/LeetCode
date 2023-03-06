package gab.leetcode;
import java.util.HashMap;
import java.util.Scanner;



public class ValidAnagram {

    /*
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ValidAnagram validAnagram = new ValidAnagram();

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(String.valueOf(validAnagram.isAnagram(s,t)));

    }

     */

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once
    //Example 1:
    //
    //Input: s = "anagram", t = "nagaram"
    //Output: true
    //Example 2:
    //
    //Input: s = "rat", t = "car"
    //Output: false


    public boolean isAnagram(String s, String t){
        HashMap<Character, Integer> freqTable1 = new HashMap<>();// Create 2 instance of a hashmap for the corresponding String array
        HashMap<Character, Integer> freqTable2 = new HashMap<>();
        for (char c: s.toCharArray()){
            freqTable1.put(c, freqTable1.getOrDefault(c,0)+1); // for each loop to put each character in a hashmap and add a counter
        }

        for(char h: t.toCharArray()){
            freqTable2.put(h, freqTable2.getOrDefault(h,0)+1); // for each loop to put each character in a hashmap and add a counter
        }

        if (!freqTable1.keySet().equals(freqTable2.keySet())){ //checks if both hashmaps has the same keys which in this case are characters
            return false;
        }

        for(Character key: freqTable1.keySet()) {
            if (!freqTable1.get(key).equals(freqTable2.get(key))) {// checks the amount of characters
                return false;
            }
        }

        return true;

    }
}
