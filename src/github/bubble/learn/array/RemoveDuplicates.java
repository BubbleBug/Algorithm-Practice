package github.bubble.learn.array;

/**
 * Created by wangshuang on 2015/4/22.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 */
public class RemoveDuplicates {
    public int removeDuplicatesFromSorted(int[] A){
        if (A.length<=1) return A.length;
        int i=0, j=0;
        while (j<A.length){
            if (A[j]!=A[i]){
                i++;
                A[i]=A[j];
            }
            j++;
        }
        return i+1;
    }
}
