public class pat5
{
  void main()
  {
    for(int row=1;row<=4;row++)
    {
      for(int col=3;col>=row;col--)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      {
       System.out.print("*");
      }
      for(int col=1;col<row;col++)
      {
       System.out.print("*");
      }
    System.out.println();
    }
    for(int row=1;row<=4;row++)
    {
      for(int col=1;col<row;col++)
      {
        System.out.print(" ");
      }
      for(int col=3;col>=row;col--)
      {
       System.out.print("*");
      }
      for(int col=4;col>=row;col--)
      {
       System.out.print("*");
      }
    System.out.println();
    }
  }
  public static void main(String args[])
  {
    pat5 me=new pat5();
      me.main();
  }
}
