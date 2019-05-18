import java.io.*;
import java.math.*;
class anotherarray
{
    public static void main(String args[])throws IOException
    {
        //InputStreamReader ab =x
        BufferedReader cd =new BufferedReader(new InputStreamReader(System.in));
        int n,i,s=0;

        System.out.println("enter a number:");
        n=Integer.parseInt(cd.readLine());
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
         System.out.println("enter the"+(i+1)+"element");
         arr[i]=Integer.parseInt(cd.readLine());
         s=s+arr[i];
        }
        
        System.out.println(s);
    }
}