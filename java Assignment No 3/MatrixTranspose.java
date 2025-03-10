import java.util.Scanner;
class MatrixTranspose
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];

int res [][]=new int[3][3];

for(int i=0;i<3;i++)
{
   for(int j=0;j<3;j++)
   {
       System.out.println("Enter Elements:");
	   arr[i][j]=sc.nextInt();
   }
 
 }
 
 
 for(int ar[]:arr)
 {
	 for(int x:ar)
	 {
		 System.out.print(x+" ");
	 }
 System.out.println();
 }
 System.out.println("Transpose Matrix");
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 System.out.print(arr[j][i]+" ");
	
	}
    System.out.println();
	}
 
}
}
********************************************************
E:\CDAC-Puja\Java Module\day 5>javac MatrixTranspose.java

E:\CDAC-Puja\Java Module\day 5>java MatrixTranspose
Enter Elements:
1
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
1 2 3
4 5 6
7 8 9
Transpose Matrix
1 4 7
2 5 8
3 6 9

E:\CDAC-Puja\Java Module\day 5>



























