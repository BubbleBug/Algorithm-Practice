package github.bubble.learn.Stack;

/**
 * Created by wangshuang on 2015/5/18.
 *
 * Reads in a string and checks to see if the parentheses are balanced.
 *
 * input:[()]{}{[()()]()}
 * output:true
 *
 * input:[(])
 * output:false
 *
 */
public class Parentheses {

    private static final char LEFT_PAREN     = '(';
    private static final char RIGHT_PAREN    = ')';
    private static final char LEFT_BRACE     = '{';
    private static final char RIGHT_BRACE    = '}';
    private static final char LEFT_BRACKET   = '[';
    private static final char RIGHT_BRACKET  = ']';

    public boolean isBalanced(String string){
        Stack<Character> chars=new Stack<Character>();
        if(string==null || string=="")return false;
        for (int i=0;i<string.length();i++){
            if(string.charAt(i)==LEFT_PAREN){
                chars.push(LEFT_PAREN);
            }else if(string.charAt(i)==LEFT_BRACE){
                chars.push(LEFT_BRACE);
            }else if(string.charAt(i)==LEFT_BRACKET){
                chars.push(LEFT_BRACKET);
            }else if(string.charAt(i)==RIGHT_PAREN){
                if(chars.isEmpty())return false;
                if(chars.pop()!=LEFT_PAREN)return false;
            }else if(string.charAt(i)==RIGHT_BRACE){
                if(chars.isEmpty())return false;
                if(chars.pop()!=LEFT_BRACE)return false;
            }else if(string.charAt(i)==RIGHT_BRACKET){
                if(chars.isEmpty())return false;
                if(chars.pop()!=LEFT_BRACKET)return false;
            }
        }
        return chars.isEmpty();
    }
}
