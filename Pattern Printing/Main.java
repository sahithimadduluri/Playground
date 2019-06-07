import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int column=in.nextInt();
      for(int i=1;i<=row;i++)
      {
        for(int i2=column;i2>column-i;i2--)
        {
          System.out.print(i2);
        }
        for(int i2=1;i2<=column-i;i2++)
        {
          System.out.print(row-i+1);
        }
        System.out.println();
      }
    }
}