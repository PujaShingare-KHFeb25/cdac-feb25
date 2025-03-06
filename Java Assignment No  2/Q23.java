import java.util.Scanner;
class Q23
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  Number:");
int a=sc.nextInt();

String res=(a &1)==0 ? "Even":"Odd";
System.out.println(res);


  
}
}
************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q23.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q23
Enter  Number:
5
Odd

E:\CDAC-Puja\Java Module\assignment No 2>java Q23
Enter  Number:
6
Even

E:\CDAC-Puja\Java Module\assignment No 2>