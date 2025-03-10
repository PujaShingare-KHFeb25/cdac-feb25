import java.util.Scanner;

class Q12EvenOdd
{

public static void main(String args[])
{
int arr[]=new int[20];
Scanner sc=new Scanner(System.in);
int count=0;
	int count1=0;
for(int i=0;i<20;i++)
{
	
	System.out.println("Enter the Elements:");
	arr[i]=sc.nextInt();
}

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
int count2=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]%3==0)
	{
		count2++;
	}
}
System.out.println("Number Of Even Elements:"+count);
System.out.println("Number Of Even Elements:"+count1);	


System.out.println("Number Of Even Elements:"+count2);
}
}
********************************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac Q12EvenOdd.java

E:\CDAC-Puja\Java Module\Assignment No 3>java Q12EvenOdd
Enter the Elements:
1
Enter the Elements:
2
Enter the Elements:
3
Enter the Elements:
4
Enter the Elements:
5
Enter the Elements:
6
Enter the Elements:
7
Enter the Elements:
8
Enter the Elements:
9
Enter the Elements:
10
Enter the Elements:
11
Enter the Elements:
12
Enter the Elements:
13
Enter the Elements:
14
Enter the Elements:
15
Enter the Elements:
16
Enter the Elements:
17
Enter the Elements:
18
Enter the Elements:
19
Enter the Elements:
20
Number Of Even Elements:10
Number Of Even Elements:10
Number Of Even Elements:6

E:\CDAC-Puja\Java Module\Assignment No 3>







































































































































