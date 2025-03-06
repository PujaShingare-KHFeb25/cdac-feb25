import java.util.Scanner;
class Q18
{
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int marks=sc.nextInt();
 String s=marks==40 || marks>=40? "pass":"Fail";
 
 System.out.println(s);
}

}
*********************************************************
E:\CDAC-Puja\Java Module\assignment No 2>java Q18
Enter the marks
90
pass

E:\CDAC-Puja\Java Module\assignment No 2>java Q18
Enter the marks
30
Fail

E:\CDAC-Puja\Java Module\assignment No 2>