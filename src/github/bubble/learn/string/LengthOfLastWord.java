package github.bubble.learn.string;

/**
 * Created by wangshuang on 2015/4/29.
 *
 * Question:     Length of Last Word
 * Link:         https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    //This method is very very very slow...
    public int lengthOfLastWord(String s) {
        if(s==null)return 0;
        s=s.trim();
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
            {
                return (s.length()-i-1);
            }
        }
        return s.length();
    }

    //A little faster than the first one.
    public int lengthOfLastWordFaster(String s) {
        if(s==null)return 0;
        int count=0;
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            if(s.charAt(i)==' ' && count>0)
            {
                return count;
            }
        }
        return count;
    }
}
