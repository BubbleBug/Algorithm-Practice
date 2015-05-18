package github.bubble.learn.Stack;

/**
 * Created by wangshuang on 2015/5/18.
 *
 * Decimal conversion of binary
 *
 */
public class BinaryConversion {
    public int decimalToBinary(int n){
        Stack<Integer> stack=new Stack<Integer>();
        while (n>0){
            stack.push(n%2);
            n=n/2;
        }
        int result=0;
        for (int d:stack){
            result=result*10+d;
        }
        return result;
    }
}
