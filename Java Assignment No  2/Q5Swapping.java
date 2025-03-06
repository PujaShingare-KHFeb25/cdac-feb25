import java.util.Scanner;
class Q5Swapping
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int a=10;
int b=20;
System.out.println("Values before Swapping"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Value after Swapping:"+a+" "+b);

}


}
********************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q5Swapping.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q5Swapping
Values before Swapping10 20
Value after Swapping:20 10

E:\CDAC-Puja\Java Module\assignment No 2>




