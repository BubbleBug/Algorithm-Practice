package github.bubble.learn.array;

/**
 * Created by Administrator on 2015/5/17.
 * LeetCode 88:Merge Sorted Array
 * URL: https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n>0){
            if(m==0 || nums1[m-1]<nums2[n-1]){
                nums1[n+m-1]=nums2[n-1];
                n--;
            }else {
                nums1[n+m-1]=nums1[m-1];
                m--;

            }
        }
    }
    public void merge2(int[] A,int m,int[] B,int n){
        while(n>0) A[m+n-1] = (m==0||B[n-1] > A[m-1]) ? B[--n] : A[--m];
    }
}
