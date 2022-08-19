public class prime3{

void prime_check()
{


for(int n=1;n<=100/2;n++)

{
  int count=0;
   
  for(int i=1;i<=n;i++) 
{
  if(n%i==0)  // this for modulo the n and i 
    
 { count++; // count the number which one will is divisible by same number and 1
  }
  
}
  
  if(count==2)  // if count more the 2 values will only enter this condition 
   {
     System.out.println(n+""); // print the which number are prime number
   }
   
  
 }   
}


public static void main(String args[]){
   prime3 surya =new prime3();
      surya.prime_check();
}


}

