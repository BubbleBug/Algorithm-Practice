package github.bubble.learn.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/17.
 * LeetCode 118：Pascal's Triangle
 * URL:https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results=new ArrayList<List<Integer>>();
        ArrayList<Integer> row=new ArrayList<Integer>();
        for (int i=0;i<numRows;i++){
            row.add(0,1);
            for (int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            results.add(new ArrayList<Integer>(row));
        }

        return  results;
    }
}
