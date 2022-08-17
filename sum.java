public class sum
{
   void main()
   {
   int count=0;
   int i=1;
   int n=29;
   
   while(i<=n)
   {
     if(n%i==0)
     
     
    {
       System.out.println(i+ "is factor of ");
       count++;
    }
    i++;
    }
   { 
    if(count==2)
    {
    System.out.println("this is prime number ");
     
    }
    else
    {
    System.out.println("not prime");
   }
   }
   
   System.out.println(count);
}   
   public static void main(String args[]){
     sum me=new sum();
       me.main();
}
}

