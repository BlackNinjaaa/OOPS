/* public class pattri
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
   }
public static void main(String args[])
{
  pattri me=new pattri();
  
  me.main();
}

 
}  */

public class pattri
{
   void main()
   {
     for(int row=1;row<=4;row++)
     {
       for(int col=1;col<=row;col++)
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
     } //row
   } // method
public static void main(String args[])
{
  pattri me=new pattri();
  
  me.main();
}


}


