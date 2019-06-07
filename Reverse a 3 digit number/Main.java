import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int first_digit=num/100;
    int second=((num/10)%10);
    int last=num%10;
    int reverse=last*100+second*10+first_digit;
    System.out.println(reverse);
    //Type your code here
  }
}