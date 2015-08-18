package github.bubble.learn.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangshuang on 2015/8/18.
 *
 * https://leetcode.com/problems/valid-anagram/
 * http://www.lintcode.com/zh-cn/problem/two-strings-are-anagrams/
 */
public class Anagram {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s.length() != t.length()){
            return  false;
        }
        int length=s.length();
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < length; i++){
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return  true;
    }

}
