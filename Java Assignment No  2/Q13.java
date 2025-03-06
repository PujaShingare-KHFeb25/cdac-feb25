import java.util.Scanner;
class Q13
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int a=sc.nextInt();

int mask=a>>31;
int abs=(a+mask) ^ mask;

System.out.println(abs);
}

}
**********************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q13.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q13
Enter a Number:
20
20

E:\CDAC-Puja\Java Module\assignment No 2>






















