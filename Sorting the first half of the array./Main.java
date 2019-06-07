import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int ind=0;ind<n;ind++)
    {
      list[ind]=sc.nextInt();
    }
    insertion_sort(n,list);
  }
  public static void insertion_sort(int n,int list[])
  {
    for(int i=1;i<n/2;i++)
    {
      int key=list[i];
      int i1=i-1;
      while((i1>=0)&&(list[i1]>key))
      {
        list[i1+1]=list[i1];
        i1--;
      }
      list[i1+1]=key;
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(list[i]+" ");
    }
  }
}