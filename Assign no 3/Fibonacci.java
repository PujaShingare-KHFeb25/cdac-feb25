class Fibonacci
{
public static void main(String[] args)
 {
 int n=9, firstterm=0,secondterm=1;
  for(int i=1;i<=n;i++)
  {
   System.out.println(firstterm + " ,");
   int nextterm=firstterm + secondterm;
     firstterm=secondterm;
     secondterm=nextterm;
}
}
}