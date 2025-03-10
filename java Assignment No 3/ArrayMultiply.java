import java.util.Scanner;
class ArrayMultiply
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];
int res[][]=new int[3][3];

System.out.println("First Array");
for(int i=0;i<3;i++)
{
  for(int j=0;j<3;j++)
  {
     System.out.println("Enter Elements");
	arr[i][j]= sc.nextInt();
  }
}
for(int ar1[]:arr)
{
	for(int x: ar1)
	{
		System.out.print(x+" ");
	}
	System.out.println();
}
//*********************************************88
System.out.println("Second Array");

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.println("Enter Elements:");
		arr1[i][j]=sc.nextInt();
	}
}

   for(int ar2[] :arr1)
   {
	   for(int z : ar2)
	   {
		   System.out.print(z+" ");
	   }
	   System.out.println();
   }

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		for(int k=0;k<3;k++)
		{
		res[i][j]+=arr[i][k] * arr1[k][j];
		
	}
	
}
  
}
System.out.println("Matrix Multiplication:");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(res[i][j] + " ");
	}
System.out.println();
	}

sc.close();
}

}

****************************************************
E:\CDAC-Puja\Java Module\day 5>javac ArrayMultiply.java

E:\CDAC-Puja\Java Module\day 5>java ArrayMultiply
First Array
Enter Elements
1
Enter Elements
2
Enter Elements
3
Enter Elements
4
Enter Elements
5
Enter Elements
6
Enter Elements
7
Enter Elements
8
Enter Elements
9
1 2 3
4 5 6
7 8 9
Second Array
Enter Elements:
2
Enter Elements:
3
Enter Elements:
4
Enter Elements:
5
Enter Elements:
6
Enter Elements:
7
Enter Elements:
8
Enter Elements:
9
Enter Elements:
1
2 3 4
5 6 7
8 9 1
Matrix Multiplication:
36 42 21
81 96 57
126 150 93

E:\CDAC-Puja\Java Module\day 5>











































