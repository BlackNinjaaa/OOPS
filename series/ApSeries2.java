public class ApSeries2
{
  void main()
  { 
        int f=3;
        
    for(int i=2;i<=54;)
    {                         //static format fixed values
          
       
    System.out.println(i);
      i=i*f;     
    }
    
  }
  
  public static void main(String args[]){
    ApSeries2 me= new ApSeries2();
      me.main();
}
} 
 /*
public class ApSeries2
{
  void main()
  { 
        int f=2;
          
    for(int i=1;i<=10;i++)
    {
                         //dyanamic value
       
    System.out.println(f);
     
      f=(f*3);     
    }
    
  }
  
  public static void main(String args[]){
    ApSeries2 me= new ApSeries2();
      me.main();
}
} */
