import java.util.Scanner;
class Q7Boolean
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter input");
boolean a=sc.nextBoolean();
boolean b=sc.nextBoolean();
boolean c=sc.nextBoolean();

if(a==true && b==true || c==false)
{
  System.out.println("true");
}
else if(a==false || b==true && c==true)
{
  System.out.println("true");
}
else if(a==true && c==true ||b==false)
{
   System.out.println("true");
}

}

}
************************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Q7Boolean.java

E:\CDAC-Puja\Java Module\assignment No 2>java Q7Boolean
Enter input
true
false
true
true

E:\CDAC-Puja\Java Module\assignment No 2>java Q7Boolean
Enter input
true
true
false
true

E:\CDAC-Puja\Java Module\assignment No 2>

















 