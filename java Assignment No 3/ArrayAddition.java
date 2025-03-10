import java.util.Scanner;
class ArrayAddition
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[] []=new int[3][3];
int arr1[][]=new int[3][3];
int res[][]=new int[3][3];
System.out.println("First Array");

for(int i=0;i<3;i++)
{
   for(int j=0;j<3;j++)
   {
       System.out.println("Enter the Elements");
	   arr[i][j]=sc.nextInt();
   }
}
System.out.println("**************************");

for(int ar[] : arr)
{
    for(int x: ar)
	{
	
	    System.out.print(x+" ");
	}
	System.out.println();
 }
 System.out.println("Second array");
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 System.out.println("Enter elements:");
		   arr1[i][j]=sc.nextInt();
		 
	 }
 }
	 for(int ar1[]: arr1)
	 {
		 
		 for(int y :ar1)
		 {
			 System.out.print(y+" ");
		 }
		 System.out.println();
	 }
System.out.println("*********************************************");	 

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		res[i][j]=arr[i][j]+arr1[i][j];
		System.out.print(res[i][j]+" ");
	}
	System.out.println();
}
 }
 
 
}

***************************************************************************
E:\CDAC-Puja\Java Module\day 5>javac ArrayAddition.java

E:\CDAC-Puja\Java Module\day 5>java ArrayAddition
First Array
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
Enter the Elements
11
**************************
11 11 11
11 11 11
11 11 11
Second array
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
Enter elements:
22
22 22 22
22 22 22
22 22 22
*********************************************
33 33 33
33 33 33
33 33 33

E:\CDAC-Puja\Java Module\day 5>
















