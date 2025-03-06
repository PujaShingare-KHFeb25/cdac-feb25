import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a Year");
int year=sc.nextInt();

if(year%4==0 && year%100!=0 || year%400==0)
{
System.out.println("Lear Year");

}
else
{
  System.out.println("Not a Leap Year");
}

}


}
**************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac LeapYear.java

E:\CDAC-Puja\Java Module\assignment No 2>java LeapYear
Enter a Year
2016
Lear Year

E:\CDAC-Puja\Java Module\assignment No 2>javac LeapYear.java

E:\CDAC-Puja\Java Module\assignment No 2>java LeapYear
Enter a Year
2019
Not a Leap Year

E:\CDAC-Puja\Java Module\assignment No 2>




















