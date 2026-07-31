package ArrayProblems.Day5;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix
{
    public static ArrayList<Integer> spiralMat(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer>ans=new ArrayList<>();
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        while(top<=bottom && left<=right)
        {
            //Left to right
            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }
            right--;
            //Right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

   public static void main(String[] args)
   {
       int mat[][]={{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
       System.out.println(spiralMat(mat));

    }
}
