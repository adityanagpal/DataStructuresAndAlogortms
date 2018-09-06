/*
Given a limited range array contains both positive and non positive numbers, i.e., elements are in range 
from -MAX to +MAX. Our task is to search if some number is present in the array or not in O(1) time.
*/
import java.util.Scanner;
import java.lang.Math;
boolean a[][] = new boolean [1000][2];
class IndexMapping
{
  public static void main(String args[])
  {
    int[] c = {2,4,6,8,10,12,-4,-8};
    for(int i=0;i<c.length;i++)
    {
      if(c[i]>=0)
        a[c[i]][0]=1;
      else
        a[abs(c[i])][1]=1;
    } 
    System.out.println("Enter the number you wanted to search:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean f = search(n);
    if(f==1)
      System.out.println("Present");
    else
      System.out.println("Not Present");
  }
  boolean search(int b)
  {
    if(b>=0)
    {
      if(a[b][0]==1)
        return True;
      else
        return False;
    }
    else
    {
      if(a[abs(b)][1]==1)
        return True;
      else
        return False;
    }
  }
}
