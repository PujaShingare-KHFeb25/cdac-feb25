import java.util.Scanner;
class StudentPass
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter marks of three subject....");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int res=0;
   int count=0;
   if(a<=40)
   {
       count++;
}
  if(b<=40)
   {
     count++;
}
  if(c<=40)
  {
    count++;
}
 else{
   System.out.println("pass");
}
if(count>=1)
{
   System.out.println("Fail in"+count+"subjects");
}
}
}