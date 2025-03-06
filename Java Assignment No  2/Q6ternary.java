
import java.util.Scanner;
class Q6ternary
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);

System.out.println("Enter three values");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

int res=a>b&&a>c?a:b>c?b:c;
System.out.println(res);


}

}

******************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q6ternary.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q6ternary
Enter three values
5
8
99
99

E:\CDAC-Puja\Java Module\assignment No 2>


























