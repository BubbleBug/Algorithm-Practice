package github.bubble.learn.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/17.
 * LeetCode 119：Pascal's Triangle II
 * URL：https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        if(rowIndex<0){
            return null;
        }
        for (int i=0;i<rowIndex+1;i++){
            row.add(1);
            for (int j=i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
        }


        return row;
    }
}
