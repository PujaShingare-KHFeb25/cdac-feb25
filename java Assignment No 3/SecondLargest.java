class SecondLargest
{
public static void main(String args[])
{

int arr[]={10,20,30,40,50};

int max=0;
int secondlargest=0;
for(int i=0;i<arr.length;i++)
{
   if(arr[i]>max)
   {
	   max=arr[i];
   }
}

for(int i=0;i<arr.length;i++)
{
	if(arr[i]>secondlargest && arr[i]!=max)
	{
		secondlargest=arr[i];

	}
	
}
System.out.println("Second Largest Element"+secondlargest);
}
}
******************************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac SecondLargest.java

E:\CDAC-Puja\Java Module\Assignment No 3>java SecondLargest
Second Largest Element40

E:\CDAC-Puja\Java Module\Assignment No 3>

