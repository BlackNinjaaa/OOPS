public class ApSeries4
{
  void main ()
  {
    int sum =0;
    int first=0;
    int second=1;
    
    for(int i=1;i<=10;i++)
    {
      sum = first +second;
       first=second;
       second=sum;
       System.out.println(sum);
    }
  }

public static void main(String args[])
{
  ApSeries4 me=new ApSeries4();
  me.main();
}
	
}

