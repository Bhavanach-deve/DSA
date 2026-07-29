//LeetCode
//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
package ArrayProblems.Day5;

public class MatrixDiagonalSum
{
    public static int diagonalSum(int mat[][])
    {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j||i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int arr[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(arr));


    }

}
