import java.util.Scanner;
class Q13Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[20];

for(int i=0;i<20;i++)
{
	System.out.println("Enter Elements");
	    arr[i]=sc.nextInt();
}
int count=0;
int count1=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>75)
	{
		count++;
	}
	else if(arr[i]<40)
	{
		count1++;
	}
		
}
System.out.println("Number of Student above 75% ="+count);
System.out.println("Number of Student below 40% ="+count1);
}

}
************************************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac Q13Student.java

E:\CDAC-Puja\Java Module\Assignment No 3>java Q13Student
Enter Elements
85
Enter Elements
63
Enter Elements
96
Enter Elements
45
Enter Elements
43
Enter Elements
57
Enter Elements
23
Enter Elements
49
Enter Elements
35
Enter Elements
40
Enter Elements
22
Enter Elements
58
Enter Elements
61
Enter Elements
76
Enter Elements
52
Enter Elements
34
Enter Elements
57
Enter Elements
56
Enter Elements
94
Enter Elements
35
Number of Student above 75% =4
Number of Student below 40% =5