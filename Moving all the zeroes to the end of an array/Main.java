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
      zeroes_at_the_end(arr_size,arr);
      for(int index=0;index<=arr_size-1;index++)
      {
        System.out.print(arr[index]+" ");
      }
    }
  public static void zeroes_at_the_end(int arr_size,int arr[])
  {
    int count=0;
    for(int ind=0;ind<=arr_size-1;ind++)
    {
      if(arr[ind]!=0)
      {
        int temp=arr[ind];
        arr[ind]=arr[count];
        arr[count]=temp;
        count++;
      }
    }
    }
}