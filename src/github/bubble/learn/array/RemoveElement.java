package github.bubble.learn.array;

/**
 * Created by wangshuang on 2015/4/22.
 */
public class RemoveElement {
    public int removeElement(int[] A ,int elem){
        int m=0;
        for (int i=0;i<A.length;i++){
            if(A[i]!=elem){
                A[m++]=A[i];
            }
        }
        return m;
    }
}
