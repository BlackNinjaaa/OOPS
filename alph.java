public class alph
{
  void main()
  {
    for(int row=1;row<=4;row++)
    {
      for(int col=1;col<=5;col++)
      {
        if(col==1 ||row==1 || row==3|| col==4)
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print("");      
        }
        
      }
  System.out.println();  }
  }
  
  public static void main(String args[])
  {
    alph me=new alph();
    me.main(); 
  }
}

