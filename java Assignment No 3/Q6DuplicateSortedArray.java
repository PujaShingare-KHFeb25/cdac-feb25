import java.util.Scanner;
class Q6DuplicateSortedArray{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];

for(int i=0;i<5;i++)
{
   System.out.println("Enter Elements:");
      arr[i]=sc.nextInt();
}
int duplicate=0;
for(int i=0;i<arr.length;i++)
{
   for(int j=i+1;j<arr.length;j++)
   {
      if(arr[i]==arr[j])
	  {
	     duplicate=arr[j];
	  }
   }
}
System.out.println(duplicate);
}
}
*****************************************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac Q6DuplicateSortedArray.java

E:\CDAC-Puja\Java Module\Assignment No 3>java Q6DuplicateSortedArray
Enter Elements:
1
Enter Elements:
1
Enter Elements:
2
Enter Elements:
3
Enter Elements:
5
1

E:\CDAC-Puja\Java Module\Assignment No 3>