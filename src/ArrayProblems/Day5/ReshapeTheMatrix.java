//LeetCode
//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
package ArrayProblems.Day5;

public class ReshapeTheMatrix
{
    public static int[][] matrixreshape(int mat[][],int r,int c)
    {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[r][c];
        if(n*m!=r*c) {
            return mat;
        }else{
            for(int i=0;i<n*m;i++)
            {
                int oldRow=i/m;
                int oldCol=i%m;

                int newRow=i/c;
                int newCol=i%c;

                ans[newRow][newCol]=mat[oldRow][oldCol];
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int mat[][]={{1,2},{3,4},{5,6}};
        int r=2;
        int c=3;
        matrixreshape(mat,r,c);
    }
}
