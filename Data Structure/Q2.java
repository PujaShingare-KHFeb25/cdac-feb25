import java.util.*;
class Q2
{

static boolean isanagram(String s1, String s2)
{
	char arr1[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	for(int i=0;i<arr1.length;i++)
	{
		int count=0;
		for(int j=0;j<arr2.length;j++)
		{
			
			if(arr1[i]==arr2[j])
			{
				count++;
			}
		}
		if(count==0){
			return false;
	}}
	return true;
}
static String longestword(String str)
{
	String arr[]=str.split(" ");
	int count=0;
	String ans=" ";
	for(String ss:arr)
	{
		if(ss.length()>count)
		{
			ans=ss;
		}
	}
	return ans;
}
static void vowelConsoCount(String ss1)
{
	char ar1[]=ss1.toLowerCase().toCharArray();
	int vowel=0;
	int conso=0;
	ArrayList<Character> a1=new ArrayList<>();
	a1.add('a');
	a1.add('e');
	a1.add('i');
	a1.add('o');
	a1.add('u');
	for(char ch:ar1)
	{
		if(a1.contains(ch))
		{
			vowel++;
		}
		else
		{
			if(ch!=' ')
			conso++;
		}
	}
	System.out.println("Vowel Count ;"+vowel+"Consonant Count:"+conso);
	
}

public static void main(String args[])
{
 String str1="listen";
 String str2="silent";
 
 String s3="Practice makes a man perfect";
 
 boolean res=isanagram(str1,str2);
 System.out.println(res);
 System.out.println("*****************************");
String answer=longestword(s3);
System.out.println(answer);
System.out.println("********************************");
 vowelConsoCount(s3);
}
}
****************************************************************************************
:\CDAC-Puja\DSA JAVA MODULE\Assisnment 1 DSA>javac Q2.java

E:\CDAC-Puja\DSA JAVA MODULE\Assisnment 1 DSA>java Q2
true
*****************************
perfect
********************************
Vowel Count ;9Consonant Count:15

E:\CDAC-Puja\DSA JAVA MODULE\Assisnment 1 DSA>

