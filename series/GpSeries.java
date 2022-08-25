class GpSeries1
{
void main()

  { 
        int f=1;
        int s=2;
        int sum=2; // next valuse got from this 
        
        // 1,2,6,15,31,56,92,141,..
        
    for(int i=1;i<=10;i++)
    {  System.out.println(f);  
         f=s;
        s=(sum*sum)+f; 
        sum++;
    } 
  System.out.println();}
  }
     
  
 class GpSeries2 extends GpSeries1
{
void program()

  { 
        int f=8;
        int s=29;
        int sum=0; // next valuse got from this 
        
        // 8,29,113,449,_,_,..
        
    for(int i=1;i<=5;i++)
    {  System.out.println(f);  
         sum=(s-f);
        f=s; 
        s=(sum*4)+f;
    } 
  System.out.println();} //method
  } //class
  
  class GpSeries3 extends GpSeries2
  
  {
    void program1()
    {
      int f=2;
      int s=4;
      int sum=2;
      
      // 2,4,
      
      for(int i=1;i<=6;i++)
      {
       System.out.println(f);
        f=(sum*f);
        sum++;
      }
    } //method
  }//class
    
     public class GpSeries{
     
  public static void main(String args[]){
    GpSeries3 me= new GpSeries3();
       me.main();
      me.program();
      me.program1();
}
} 
