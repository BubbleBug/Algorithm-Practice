package github.bubble.learn.Stack;

import org.junit.Test;
import java.util.Iterator;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test(){
        Stack<String> s=new Stack<String>();
        s.push("I");
        s.push(" ");
        s.push("love");
        s.push(" ");
        s.pop();
        s.push("algorithm");
        s.push("!");
        String s1=s.peek();
        s.pop();
        String s2=s.peek();
        assertEquals("!",s1);
        assertEquals("algorithm",s2);
        assertEquals(4,s.size());
        assertEquals(false,s.isEmpty());
        String[] result=new String[]{"algorithm","love"," ","I"};
        Iterator<String> i=s.iterator();
        int n=0;
        while (i.hasNext() && n<result.length){
            String str=i.next();
            assertEquals(result[n],str);
            n++;
        }
    }
}