import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int cur_row=1;cur_row<=n;cur_row++)
      {
        for(int cur_col=1;cur_col<=n;cur_col++)
        {
          if(((cur_row%2==0)&&(cur_col==1))||
             ((cur_row%2==1)&&(cur_col==n)))
          {
            System.out.print(cur_row+1);
          }
          else
          {
            System.out.print(cur_row);
          }
        }
        System.out.println();
      }
	}
}