import java.io.*;
import java.math.*;
class myarray
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
       int a;
       System.out.println("Enter a number : ");
       a = Integer.parseInt(cd.readLine());
       System.out.println(" a = "+a);
       /*
       for(i=1;i<=100;i++)
       {
           System.out.println((int)(Math.random()*10)); // this is sl cmt0
       
       }
       */
    }
}
