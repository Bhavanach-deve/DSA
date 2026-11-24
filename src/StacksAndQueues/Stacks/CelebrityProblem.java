//Consider a party being organized by some people. A celebrity is a person who is known to all but does not know anyone at the party.
//A square matrix mat[][] is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person.
//You need to return index of the celebrity in the party.
//If the celebrity does not exist, return -1.
package StacksAndQueues.Stacks;

public class CelebrityProblem
{
    public static int celebrity(int mat[][])
    {
        int top=0;
        int down=mat.length-1;
        while(top<down){
            if(mat[top][down]==1){
                top=top+1;
            }else
            {
                down=down-1;
            }
        }
        int candidate=top;
        for(int i=0;i<mat.length-1;i++){
            {
                if(i==candidate){
                    continue;
                }if(mat[candidate][i]==1 || mat[i][candidate]==0){
                    return -1;
            }
            }
        }
        return candidate;
    }

   public static void main(String[] args)
   {
       int [][]mat={{0,1,1,0},{0,0,0,0},{0,1,0,0},{1,1,0,0}};
       System.out.println(celebrity(mat));
       int mat1[][]={{1,1,0},{0,1,0},{0,1,1}};
       System.out.println(celebrity(mat1));

   }
}
