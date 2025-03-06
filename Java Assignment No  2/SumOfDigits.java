import java.util.Scanner;

class SumOfDigits
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
int sum=0;
while(n!=0)
{
         int rem=n%10;
sum=sum+rem;
n=n/10;

}
System.out.println(sum);


}



*******************************************
E:\CDAC-Puja\Java Module\assignment No 2>javac SumOfDigits.java

E:\CDAC-Puja\Java Module\assignment No 2>java SumOfDigits
Enter a Number
4896
27

E:\CDAC-Puja\Java Module\assignment No 2>









