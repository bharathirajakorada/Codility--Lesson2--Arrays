// package whatever; // don't place package name!

import java.io.*;

class Solution 
{ 
  public int solution(int[] A)
  {
    int max = 0;
    int B[] = new int[100000000];
    for(int i = 0; i < A.length; i++)
    { 
      B[A[i]] = ~ B[A[i]];
        if(A[i] > max)
          max = A[i];
    }
    for(int j = 1; j <= max; j++)
    {
     // System.out.println(B[j]);
      if(B[j] == -1) 
         return (j); 
    }
    
    return 0; // this should never happen
  }
  public static void main (String[] args) 
  {
    int A[] = {9,3,9,3,9,7,9};
    Solution t = new Solution();
    int B = t.solution(A);
    System.out.println(B);//output should be 7
    
int x = -1;
System.out.println(Integer.toBinaryString(x));
    
  }
}
