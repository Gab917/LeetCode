package gab.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GroupAnagrams {

    public static void main(String[] args){
        GroupAnagrams grp = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(grp.groupAnagrams(strs));
        //grp.groupAnagrams(strs);

    }

    public Set<List<String>> groupAnagrams(String[] strs){
        Set<List<String>> result = new HashSet<>();
        List<String> subresult = new ArrayList<>();
        ValidAnagram anagram = new ValidAnagram();

        for(int i = 0; i <= strs.length-1; i++){
            subresult.clear();
            for(int j = 0; j<= strs.length-1; j++){
                if(anagram.isAnagram(strs[i],strs[j])) {
                    subresult.add(strs[j]);

                }
            }
            //System.out.println(subresult);
            result.add(subresult);

        }
        //System.out.println(result);
        return result;
    }


}
