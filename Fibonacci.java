import java.util.Scanner;
public class Fibonacci
{
public static void main(String[] args)
{
int p=0,q=1,r,num;
Scanner s=new Scanner(System.in);
System.out.println("enter how many numbers to be printed");
num=s.nextInt();
System.out.println("The first "+num+" numbers in Fibonacci series are");
System.out.print(p+"  "+q);
while(num>0)
{
r=p+q;
System.out.print("  "+r);
p=q;
q=r;
num--;
}
}
}
