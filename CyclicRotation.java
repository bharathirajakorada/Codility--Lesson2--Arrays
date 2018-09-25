// package whatever; // don't place package name!
import java.lang.*;
class Solution 
{ 
  public int[] solution(int[] A, int K)
  {
    int B[] = new int[A.length];
    if (K != 0)
    {
      K = K % A.length;
    }
    for(int i = 0; i < A.length; i++)
    {
      int j = (i + K + A.length) % A.length;
      B[j] = A[i];
    }
    return B;
  }
  void test (int[] A, int K)
  { 
    int B[] = new int[A.length];
    B = solution (A,K);
    for(int i = 0; i < A.length; i++)
    {
      System.out.println(B[i]);
    }
  }
  public static void main(String[] args)
  {
    int a[] = {1,2,3,4,5};
    int k = 3;
    Solution t = new Solution();
    t.test (a, k);
  }
}

