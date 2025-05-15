import java.util.Scanner;
import java.util.*;
class SecondLargestElementQ1
{



	static int secondlargest(int arr[])
	{
		int m=arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=m-1;i>0;i--)
		{
			if(arr[i]!=arr[m-1])
			{
				return arr[i];
			}
		}
		return -1;
	}
	static void shiftZero(int []arr){

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				int temp=arr[i];
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]!=0){
					arr[i]=arr[j];
					arr[j]=temp;
					break;
				}
			}
			}
		}

	}
	}

class Q1
{
	
public static void main(String args[])
{
int arr[]=new int[]{10,0,5,20,0,8,15};
int result=SecondLargestElementQ1.secondlargest(arr);
System.out.println("Second Largest Element: "+result);
//***************************************************

  SecondLargestElementQ1.shiftZero(arr);
		System.out.println(Arrays.toString(arr));

}
}      