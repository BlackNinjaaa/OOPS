public class prime{

void prime_check()
{
  int count=0;
  int i=1;
  int n=9;
  boolean flag=false;
  
  while(i<=n)
{
   if(n%i==0)
{
  count++;
  }
  if(count >2)
  {
    flag=true;
    break;
  
  }
  i++;
  }
  {
  if(flag==true)
   {
     System.out.println("not prime");
   }
   else
   {System.out.println("prime");}
  }
   

  System.out.println(count++);
}
public static void main(String args[]){
   prime surya =new prime();
      surya.prime_check();
}
}







