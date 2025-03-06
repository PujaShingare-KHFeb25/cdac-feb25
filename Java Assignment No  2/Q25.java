import java.util.Scanner;

class Q25
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=sc.nextInt();

while(n!=0)
{
	int rev=0;
 rev=rev*10+n%10;
 n=n/10;
 System.out.println(rev); 

}

}


}
**************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q25.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q25
Enter a Number:
4896
6
9
8
4

E:\CDAC-Puja\Java Module\assignment No 2>