import java.util.Scanner;
class Uppercase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Character:");
char c=sc.next().charAt(0);

String res=c>=65 &&c<=96? "Uppercase Letter":c>=97 && c<=122? "Lowercase Letter":"Not a Letter";
System.out.println(res);

}
}
**************************************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Uppercase.java

E:\CDAC-Puja\Java Module\assignment No 2>java Uppercase
Enter a Character:
8
Not a Letter

E:\CDAC-Puja\Java Module\assignment No 2>java Uppercase
Enter a Character:
a
Lowercase Letter

E:\CDAC-Puja\Java Module\assignment No 2>java Uppercase
Enter a Character:
A
Uppercase Letter

E:\CDAC-Puja\Java Module\assignment No 2>