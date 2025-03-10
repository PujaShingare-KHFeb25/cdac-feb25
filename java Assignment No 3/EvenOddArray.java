import java.util.Scanner;
class EvenOddArray
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];

for(int i=0;i<10;i++)
{
	
	System.out.println("Enter Elements:");
	arr[i]=sc.nextInt();
}
   for(int x:arr)
   {
	   System.out.println(x);
   }
   int count=0;
   int count1=0;
   for(int i=0;i<arr.length;i++)
   {
   if(arr[i]%2==0)
   {
	   count++;
	   
   }
   else
   {
	   count1++;
   }
   
   }
   System.out.println("Even no="+count);
   System.out.println("Odd no="+count1);
}

}
**********************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac EvenOddArray.java

E:\CDAC-Puja\Java Module\Assignment No 3>java EvenOddArray
Enter Elements:
54
Enter Elements:
65
Enter Elements:
98
Enter Elements:
63
Enter Elements:
10
Enter Elements:
23
Enter Elements:
78
Enter Elements:
5632
Enter Elements:
14
Enter Elements:
99
54
65
98
63
10
23
78
5632
14
99
Even no=6
Odd no=4

E:\CDAC-Puja\Java Module\Assignment No 3>java ReverseArray















