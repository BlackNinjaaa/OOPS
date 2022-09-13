public class Index
{
 
 int count=1;
 int odd=0;
 int even=0;
 
 void find(int n)
 {
  while(n>0)
  {
    if(count%2 !=0)
    {
      odd=odd+(n%10);
    }
    else
    {
      even=even+(n%10);
    }
       n=n/10;
         count++;
  }

 
 System.out.println(odd-even);
 }
 
 public static void main(String args[])
 {
   Index add=new Index();
   add.find(3874);
 }
}
