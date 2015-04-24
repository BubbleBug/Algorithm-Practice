package github.bubble.learn.array;

import java.util.HashMap;

/**
 * Created by wangshuang on 2015/4/24.
 */
public class FindNonRepeated {
    //Find first no repeat char of a string
    public Character firstNonRepeated(String str){
        char[] strChars=str.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        for (int i=0;i<strChars.length;i++){
            if(hashMap.containsKey(strChars[i])){
                hashMap.put(strChars[i],hashMap.get(strChars[i])+1);
            }else {
                hashMap.put(strChars[i],1);
            }
        }
        for (Character character:strChars){
            if(hashMap.get(character)==1){
                return character;
            }
        }
        return null;
    }
}
