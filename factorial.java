import java.util.Scanner;
class Factorial
{
 public static void main(String xyz[])
 {
   int i,fact=1;
   System.out.println("enter the number");
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   for(i=1;i<=n;i++)
   {
    fact=fact*i;
   }
    System.out.println("factorial of "+n+" is:"+fact);
   
 }
}
