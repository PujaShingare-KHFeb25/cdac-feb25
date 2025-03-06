import java.util.Scanner;
class Q17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter four Number:");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();

int res=a>b &&a>c && a>d ?a: b>c && b>d && b>a ? b: c>d && c>a &&c>b ? c:d;
System.out.println(res);
}

}
*******************************************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q17.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q17
Enter four Number:
4 5
8
9
9

E:\CDAC-Puja\Java Module\assignment No 2>