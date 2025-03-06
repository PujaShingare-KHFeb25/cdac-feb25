import java.util.Scanner;

class Q22
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number:");
int a=sc.nextInt();
int b=sc.nextInt();

int res=0;
System.out.println("Enter Your Choice:");
char c=sc.next().charAt(0);

switch(c){

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
           res=a/b;
		    System.out.println(res);
			break;
	case '%':
           res=a%b;
		    System.out.println(res);
			break;

     default:
	           System.out.println("Invalid Input");
}
}

}
***********************************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q22.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q22
Enter two number:
200
100
Enter Your Choice:
%
0

E:\CDAC-Puja\Java Module\assignment No 2>
