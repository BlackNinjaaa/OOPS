public class sum1
{  
  void main()
  {
     int n=1234;
     int sum=0;
     
     for(int i=1;n>0;n=n/10)
     {
       sum = sum+n%10;
       
       } 
 
 System.out.println(sum);
  }
  
  public static void main(String args[])
  {
  sum1 me=new sum1();
  me.main();
  }
  

}
