package github.bubble.learn.array;

/**
 * Created by wangshuang on 2015/4/24.
 * Input:str="I can do it" removeStr="cdi"
 * Output:"I an o t"
 */
public class RemoveChars {
    public String removeChars(String str,String removeStr){
        if(str.length()==0 || removeStr.length()==0)return str;
        int m=0;
        char[] removeChars=removeStr.toCharArray();
        char[] strChars=str.toCharArray();
        boolean[] isRemove=new boolean[128];
        for (int i=0;i<removeStr.length();i++){
            isRemove[removeChars[i]]=true;
        }
        for (int j=0;j<strChars.length;j++){
            if(!isRemove[strChars[j]]){
                strChars[m++]=strChars[j];
            }
        }
        return new String(strChars,0,m);
    }
}
