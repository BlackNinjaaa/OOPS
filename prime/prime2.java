public class prime2{

void prime_check()
{
int n=1;

while(n<=200)
{
  int count=0;
  int i=1;
   
  while(i<=n)
{
   if(n%i==0)
{
  count++;
  }
  
  i++;
  }
  
  if(count==2)
   {
     System.out.println(n+"");
   }
   n++;
  }
    
}


public static void main(String args[]){
   prime2 surya =new prime2();
      surya.prime_check();
}


}

