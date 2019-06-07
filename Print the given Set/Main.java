import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> hs = new LinkedList<String>();
      String m =br.readLine();
      String[] arr = m.split(",");
      for(int i=0;i<arr.length;i++)
      {
        hs.add(arr[i]);
      }
      System.out.println(hs);
    }
}