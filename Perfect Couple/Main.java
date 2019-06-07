import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int ind=0;ind<=arr_size-1;ind++)
      {
        arr[ind]=in.nextInt();
      }
      int value=in.nextInt();
      perfect_couple(arr_size,arr,value);
    }
  public static void perfect_couple(int arr_size,int arr[],int value)
  {
    for(int ind1=0;ind1<=arr_size-1;ind1++)
    {
      for(int ind2=ind1+1;ind2<=arr_size-1;ind2++)
      {
        int sum=arr[ind1]+arr[ind2];
        if(sum==value)
        {
          System.out.println(arr[ind1]+","+" "+arr[ind2]);
        }
      }
    }
    }
}