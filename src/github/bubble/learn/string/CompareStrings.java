package github.bubble.learn.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wangshuang on 2015/8/20.
 *
 * lintcode:http://www.lintcode.com/en/problem/compare-strings/
 *
 */
public class CompareStrings {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        //字符串A的长度不能小于B的长度
        if(A.length() < B.length()){
            return false;
        }
        //储存B中的字符和对应的个数
        Map<Character,Integer> hm=new HashMap<Character, Integer>();
        for(int i = 0;i < B.length(); i ++){
            if(!hm.containsKey(B.charAt(i))){//hashmap中没有此字符
                hm.put(B.charAt(i),1);//添加
            }else { //hashmap中有此字符就修改字符对应的个数
                Integer n= hm.get(B.charAt(i));
                n++;
                hm.put(B.charAt(i),n);
            }
        }
        //遍历hashmap
        Iterator it=hm.entrySet().iterator();
         while (it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            Character key=(Character)entry.getKey();
            Integer value=(Integer)entry.getValue();
            int n = 0;
            for (int j = 0; j < A.length(); j++){
                if(A.charAt(j)==key){
                    n++;
                }
            }
            if (value > n){
                return  false;
            }
        }

        return true;
    }
}
