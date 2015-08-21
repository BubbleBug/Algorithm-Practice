package github.bubble.learn.string;

/**
 * Created by wangshuang on 2015/8/20.
 *
 * lintcode:http://www.lintcode.com/zh-cn/problem/strstr/
 *
 * strstr (a.k.a find sub string), is a useful function in string operation. Your task is to implement this function.
 * For a given source string and a target string, you should output the first index(from 0) of target string in source string.
 * If target does not exist in source, just return -1.
 * Have you met this question in a real interview? Yes
 * Example
 * If source = "source" and target = "target", return -1.
 * If source = "abcdabcdefg" and target = "bcd", return 1.
 */
public class StringSearch {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //特殊情况
        if((source =="" && target == "") || target == ""){
            return 0;
        }
        if(source == null || target == null){
            return -1;
        }
        int tl=target.length();
        int sl=source.length();
        char tc1=target.charAt(0);
        for (int i=0;i< sl -tl;i ++){
            if(tc1==source.charAt(i)){ //找出字符串target第一个字符出现的位置
                if(checkStr(source,target,i,tl)){
                    return 1;
                }
            }
        }
        return -1;
    }

    private boolean checkStr(String s,String t,int begin,int length){
        int n=0;
        for (int i = begin;i< begin + length;i++){
            if(t.charAt(n)!=s.charAt(i)){
                return false;
            }
            n++;
        }
        return true;
    }
}
