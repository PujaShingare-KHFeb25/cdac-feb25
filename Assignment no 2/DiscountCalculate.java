import java.util.Scanner;
class DiscountCalculate
{
public static void main(String args[])

{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Amount:");
 int amt=sc.nextInt();
 double disc=0.0;
 if(amt>=1000)
  {
    disc=amt-(amt*20/100);
    System.out.println("discount price:" + disc);
}else if(amt>500 && amt<999)
{
   disc=amt-(amt*10/100);
   System.out.println("discount price:" + disc);
}else if(amt<500)
{
  disc=amt-(amt*5/100);
   System.out.println("discount price:" + disc);
}
   

 
  

}

}