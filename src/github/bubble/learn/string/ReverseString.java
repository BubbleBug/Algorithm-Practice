package github.bubble.learn.string;

import github.bubble.learn.Stack.Stack;

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

    public String reverseStringExchange(String str){
        if(str==null)return null;
        char[] chars=str.toCharArray();
        int length=chars.length;
        chars=reverseChars(chars,0,str.length()-1);
        int start=0,end=0;
        while(end<length){
            if(chars[end]==' ' || chars[end]=='\0'){
                chars=reverseChars(chars,start,end-1);
                start=end+1;
            }
            end++;
        }

        chars=reverseChars(chars,start,length-1);
        return String.valueOf(chars);
    }

    char[] reverseChars(char[] characters,int start,int end){
        for(;start<end;start++,end--){
            char c = characters[start];
            characters[start] = characters[end];
            characters[end] = c;
        }
        return characters;
    }

    //Use double stack
    public String reverseStringDoubleStack(String str){
        if(str==null)return null;
        int length=str.length();
        Stack<Character> charsStack=new Stack<Character>();
        Stack<Character> words=new Stack<Character>();
        for (int i =0;i<length;i++){
            if(str.charAt(i)!=' '){
                charsStack.push(str.charAt(i));
            }else {
                while (!charsStack.isEmpty()) {
                    words.push(charsStack.pop());
                }
                words.push(' ');
            }
        }
        if(!charsStack.isEmpty()){
            words.push(charsStack.pop());
        }
        String result="";
        while (!words.isEmpty()){
            result+=words.pop();
        }
        return result;
    }



}
