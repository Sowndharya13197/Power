import java.io.*;
import java.util.Scanner;
public class Power 
{
    public static void main(String args[])
  {   System.out.println("enter no");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int power=1;
    System.out.println("enter power");
    int p=s.nextInt();
    for(int i=0;i<p;i++)
    {
    power=power*n;
    }
  
    System.out.println(power);
}
}
