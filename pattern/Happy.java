public class Happy
{
  void find()
  {
    int num=19;
    int sum=0;
    int a=0;
    
    
    while(num>0)
    {
      sum=num%10;
      num=num/10;
      a=((sum*sum)+(num*num));
     
      num=a;
     
      if(num<9)
    {
        System.out.println(num);
       break;
       
    }
    }
    if(num==1)
    {
    System.out.println("This is happy number");
    }
    else
    {
      System.out.println("This is not happy number");
    }
  }
  
  public static void main(String args[])
  {
    Happy me=new Happy();
    me.find();
  }
}
