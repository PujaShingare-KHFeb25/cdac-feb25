import java.util.Scanner;
class Calculator
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter First No");
 int a=sc.nextInt();
 System.out.println("Enter Second No:");
int b=sc.nextInt();
 System.out.println("Enter the Operator"); 
 char op=sc.next(".").charAt(0);
int res=0;

  switch(op)
{
case '+':
         res=a+b;
         System.out.println(res);
         break;
case '-':
         res=a-b;
         System.out.println(res);
         break;
case '*':
         res=a*b;
         System.out.println(res);
         break;
case '/': 
          if(b==0)
            {
             System.out.println("A no can not be devided by zero");
           }else
            {
         res=a/b;
         System.out.println(res);
         break;

}
}
 }
}