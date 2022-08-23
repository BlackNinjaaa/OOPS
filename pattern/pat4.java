public class pat4
{
 void Pattern()
 {
   for(int row=1;row<=5;row++)
   {
     for(int col=1;col<row;col++)
     {
       System.out.print(" ");
     }
     for(int col=4;col>=row;col--)
     {
       System.out.print("*");
     }
     for(int col=1;col<row;col++)
     {
       System.out.print("*");
       
     }
     for(int col=4;col>=row;col--)
     {
       System.out.print(" ");
     }
     
     System.out.println();
   }
 }
 
 public static void main(String args[])
 {
   pat4 me=new pat4();
    me.Pattern();
 }
}
