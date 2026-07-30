//Given a matrix mat[][] of size n × m, determine whether it is a Toeplitz matrix or not.
//
//A Toeplitz matrix (also known as a diagonal-constant matrix) is a matrix in which every descending diagonal from left to right contains the same element.
package ArrayProblems.Day5;

public class ToeplitzMatrix
{
    public static boolean toeplitz(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=mat[i-1][j-1]){
                   return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int mat[][]={{6,7,8},{4,6,7},{1,4,6}};
        System.out.println(toeplitz(mat));


    }
}
