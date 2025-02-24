class PrimeNo
{
public static void main(String[] args)
 {
   int num=2 , i;
int count=0;
  while(count < 5)
{
  
   boolean isprime=true;
  for(i=2;i*i<=num;i++)
   {
     
   if(num% i==0)
{  
       isprime=false;
        break;
}
}

 if(isprime)
     { 
     System.out.println(num + " ");
     count++;
     }
num++;
}
System.out.println();
}
}