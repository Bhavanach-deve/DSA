//Given a square matrix of size n x n, return the transpose matrix of the given matrix.
//The transpose of a matrix is obtained by converting all the rows to columns and all the columns to rows
package ArrayProblems.Day5;

import java.util.ArrayList;

public class TransposeOfAMatrix
{
    public static int[][] transpose(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=mat[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> transposeMatrix(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<m;i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
                ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int mat[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        transpose(mat);
        transposeMatrix(mat);

    }
}
