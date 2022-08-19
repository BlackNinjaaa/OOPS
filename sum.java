public class sum
{
   void main()
   {
   int count=0;
   int i=1;
   int n=29;
   
   while(i>=0)
   {
     if(n%i==0)
     
     
    {
       System.out.println(i+ "is factor of "+n);
       count++;
    }
    i++;
    }
   
   }
   public static void main(String args[])
     sum me=new sum();
       me.main();
}

