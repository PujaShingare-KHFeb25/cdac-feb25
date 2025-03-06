import java.util.Scanner;
class Q14
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter a Digit");
int a=sc.nextInt();

String b=Integer.toBinaryString(a);
System.out.println(b);

char [] c=b.toCharArray();
int count=0;
for(int i=0;i<c.length-1;i++)
{
		
	if(c[i]==1)
	{
		count++;
	}
	
}
System.out.println("No of 1 in given number is:"+count);
}


}