package github.bubble.learn.string;


import java.util.*;

/**
 * Created by wangshuang on 2015/4/24.
 *
 * Question:     Longest Substring Without Repeating Characters
 * Link:         https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String str){
        final int length=str.length();
        if(length<2)return length;
        int start=0,m=0;
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();

        for (int i=0;i<length;i++){
            if(hashMap.containsKey(str.charAt(i))) {
                Integer index = hashMap.get(str.charAt(i));
                if (index != null && index >= start) {
                    m = Math.max(m, i - start);
                    start = index + 1;
                }
            }
            hashMap.put(str.charAt(i), i);
        }

        return Math.max(m,length-start);

    }

    public int lengthOfLongestSubstringOfAnotherSolution(String str){
        if(str.length()<2)return str.length();
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        int m=0;
        for (int i=0,j=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))){
                j=Math.max(j,hashMap.get(str.charAt(i))+1);
            }
            hashMap.put(str.charAt(i), i);
            m=Math.max(m,i-j+1);
        }
        return m;

    }
}
