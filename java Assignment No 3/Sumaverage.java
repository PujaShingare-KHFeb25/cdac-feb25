import java.util.Scanner;
class Sumaverage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++)
{
   System.out.println("Enter Elements:");
     arr[i]=sc.nextInt();
   }
   int sum=0;
   for(int i=0;i<arr.length;i++)
   {
	   
	   sum=sum+arr[i];
   }
   System.out.println("sum="+sum);
   
   float Average=sum/5;
   System.out.println("Average="+Average);
}


}
*******************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac Sumaverage.java

E:\CDAC-Puja\Java Module\Assignment No 3>java Sumaverage
Enter Elements:
11
Enter Elements:
12
Enter Elements:
13
Enter Elements:
14
Enter Elements:
15
sum=65
Average=13.0

E:\CDAC-Puja\Java Module\Assignment No 3>
