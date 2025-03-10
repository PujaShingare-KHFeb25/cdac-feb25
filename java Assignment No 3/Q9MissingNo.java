import java.util.Scanner;
class Q9MissingNo
{

public static void main(String args[])
{
int arr[]={1,2,3,4,5,6,8,9,10};
int sum=0;
for(int i=0;i<arr.length;i++)
{
	sum=sum+arr[i];
	
}
	System.out.println(sum);

int n=10;
int res=0;
res=(n*(n+1))/2;
System.out.println(res);
int missingno=res-sum;
System.out.println(missingno);
}
}
***************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac Q9MissingNo.java

E:\CDAC-Puja\Java Module\Assignment No 3>java Q9MissingNo
48
55
7

E:\CDAC-Puja\Java Module\Assignment No 3>
