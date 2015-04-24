package github.bubble.learn.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangshuang on 2015/4/23.
 *
 * Given a digit string, return all possible letter combinations that the number could represent.
 */
public class LetterCombinations {

    private String[] Alphabet = {"000", "111", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private int length=0;
    private char[] result;
    private int[] phoneNumber;
    private List<String> words = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        length = digits.length();
        if (length == 0) {
            return words;
        }
        result = new char[length];
        phoneNumber=new int[length];
        for (int i=0;i<length;i++) {
            phoneNumber[i] = Integer.parseInt(String.valueOf(digits.toCharArray()[i]));
        }
       return combination(0);
    }
    //recursive
    List<String> combination(int curNumber){
        if(curNumber==length){
            words.add(new String(result));
            return words;
        }
        for(int j=0;j<Alphabet[phoneNumber[curNumber]].length();j++){
            result[curNumber]= Alphabet[phoneNumber[curNumber]].charAt(j);
            combination(curNumber+1);
            if (phoneNumber[curNumber] == 0 || phoneNumber[curNumber]==1) {
                return words;
            }

        }
        return words;
    }

}
