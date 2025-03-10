import java.util.Scanner;
class ReverseArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={10,20,30,40,50};
/*
for(int i=0;i<5;i++)
{
   System.out.println("Enter Elements:");
   arr[i]=sc.nextInt();
}
*/
for(int i=4;i>=0;i--)
{
	System.out.println(arr[i]+" ");
}

}
}
**************************************************
E:\CDAC-Puja\Java Module\Assignment No 3>javac ReverseArray.java

E:\CDAC-Puja\Java Module\Assignment No 3>java ReverseArray
50
40
30
20
10

E:\CDAC-Puja\Java Module\Assignment No 3>
