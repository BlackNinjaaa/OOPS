/*
public class ApSeries
{
  void main()
  { 
        int f=3;
        
    for(int i=11;i>=-5;)
    {
    
          i=i-f;       
       
    System.out.println(i);
    
    }
    
  }
  
  public static void main(String args[]){
    ApSeries me= new ApSeries();
      me.main();
}
} */

public class ApSeries
{
  void main()
  { 
        int f=1;
        int s=2;
        int sum=2; // next valuse got from this 
        
    for(int i=1;i<=10;i++)
    {  System.out.println(f);
         f=s;
        s=(sum*sum)+f; 
        sum++;
       
    
    
    }
    
  }
  
  public static void main(String args[]){
    ApSeries me= new ApSeries();
      me.main();
}
} 
