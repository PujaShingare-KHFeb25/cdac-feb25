class Swapping
{
public static void main(String args[])
{

int a=55;
int b=25;
System.out.println("Values before swapping");
System.out.println(a+" "+b);
System.out.println("Values after swapping");
a=a^b;
b=a^b;
a=a^b;

System.out.println(a+" "+b);



}

}
****************************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac Swapping.java

E:\CDAC-Puja\Java Module\assignment No 2>java Swapping
Values before swapping
55 25
Values after swapping
25 55

E:\CDAC-Puja\Java Module\assignment No 2>




























