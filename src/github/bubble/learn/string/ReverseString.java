package github.bubble.learn.string;

/**
 * Created by Administrator on 2015/5/1.
 * Reverse a string
 * Example：
 * Input：I can do it
 * Output:it do can I
 */
public class ReverseString {
    public String reverseString(String str){
        if(str==null)return null;
        StringBuilder sb=new StringBuilder();
        int pos=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                pos=0;
            }
            sb.insert(pos,c);
            if(c!=' '){
                pos++;
            }
        }
        return sb.toString();
    }


}
