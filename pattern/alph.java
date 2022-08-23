class Pattern_A
{
  void main()
  {
    for(int i=1;i<=4;i++)
    {
       for(int j=1; j<=4;j++)   // A pattern
      {
        if(i==1 && j>1 && j<4 || j==1 && i>1 || i==3 || j==4 && i>1 )
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print(" ");     
        }
        
      }
        System.out.println();
        }
   System.out.println("\n"); }
}
  ////////////
  
  class Pattern_B extends Pattern_A
{
  void P2()
  {
    for(int i=1;i<=5;i++)
    {
       for(int j=1; j<=5;j++)    // B pattern
      {
        if(i==1 && j<5 || j==1 || i==3 && j<5 || i==5 && j<5|| j==5 && i>1 &&i<5  )
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print(" ");     
        }
        
      }
        System.out.println();
        }
 System.out.println("\n"); }
  }
  
  //////////////////////////
  
  class Pattern_C extends Pattern_B
{
  void P3()
  {
    for(int i=1;i<=5;i++)
    {
       for(int j=1; j<=4;j++)   // C pattern
      {
        if(i==1 && j>1 || j==1 && i>1 && i<5 || i==5 && j>1 )
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print(" ");     
        }
        
      }
        System.out.println();
        }
   System.out.println("\n"); }
}
  
  public class alph{
  public static void main(String args[])
  {
   Pattern_C me=new Pattern_C ();

    me.main(); 
    me.P2();
    me.P3();
  }
}

