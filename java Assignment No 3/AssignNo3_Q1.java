import java.util.Scanner;
class AssignNo3_Q1
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  for(int i=0;i<5;i++)
  {
	  System.out.println("Enter the elements");
	  arr[i]=sc.nextInt();
  }
  int max=0;
  for(int i=0;i<arr.length;i++)
  {
	  if(arr[i]>max)
	  {
		  max=arr[i];
	  }

  }
  	  System.out.println(max);
}
}
********************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac AssignNo3_Q1.java

E:\CDAC-Puja\Java Module\Assignment No 3>java AssignNo3_Q1
Enter the elements
23
Enter the elements
63
Enter the elements
54
Enter the elements
85
Enter the elements
89
89

E:\CDAC-Puja\Java Module\Assignment No 3>