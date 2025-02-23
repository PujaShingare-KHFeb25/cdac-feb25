class ReverseNo
{
public static void main(String args[])
 {
  int no=1234,reverse=0;
   while(no!=0)
    {
     int d=no % 10;
     reverse=reverse*10+d;
     no=no/10;
}
  System.out.println(reverse);
}
}