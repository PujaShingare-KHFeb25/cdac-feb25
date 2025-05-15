import java.util.*;
class Q4
{
static int sumofdigit(int n)
{
 if(n<=1)
 return n;
 else
 {
   return n%10+sumofdigit(n/10);
 }
}
//*********************************
static int fibonacci(int m)
{
	if(m<=1)
		return m;
	else{
		return fibonacci(m-1)+fibonacci(m-2);
	}
}
//*******************************************
static int raisedtopower(int a,int b)
{
	if(b==0)
		return 1;
	else{
		return a*raisedtopower(a,b-1);
	}
}
//********************************************
static boolean isPrime(int num,int div){
        	
		if(num<2){
			return false;
		}
		if(div==1){
			return true;
		}
		if(num%div==0){
			return false;
		}
		return isPrime(num,div-1);
	
	}
	
//	*******************************************
static boolean ispalindrome(String str){
	if(str.length()<=1)
		return true;
	else if(str.charAt(0)!=str.charAt(str.length()-1))
		return false;
	else 
		return ispalindrome(str.substring(1,str.length()-1));
}
22public static void main(String args[])
{
System.out.println("Sum of Digit:"+sumofdigit(1234));
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
for(int i=1;i<=number;i++)
{
	System.out.println(fibonacci(i));
}


int a=2;
int b=5;
 System.out.println(raisedtopower(a,b));
 
 String str="racecar";
 System.out.println(ispalindrome(str));
 int num=7;
 System.out.println(isPrime(num,num/2));
}
}