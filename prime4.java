public class prime4{
void main()
{
  int n=141;
 int count=0;
 
  for(int i=2; i<=n/2;i++) // if am put n/2 mean only half of value is enough for that  
  {
     
      if(n%i==0)
      { 
        System.out.println(i);
      count++;
      
      }
      
    }
     if(count>0)
     {
       System.out.println("it is not prime");
     }
     else
     {
       System.out.println("prime");
     }
  
  }

public static void main(String args[])
{
  prime4 me = new prime4();
  
 me.main();

}
}
