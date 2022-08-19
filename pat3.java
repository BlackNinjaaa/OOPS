public class pat3
{
   void main(){
   
       for(int row=1;row<=4;row++)
       {
         for(int col=4;col>=row;col--)
         {
           System.out.print(" ");
         }
         
         for(int col=1;col<row;col++)
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
          
   public static void main(String args[]){
   
       pat3 me=new pat3();
        me.main();
   }
}
