public class pat2{
 
       void main(){
           for(int row=1;row<=3;row++)
           {
             for(int col=2;col>=row; col--)
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
           
            for(int row=1;row<=3;row++)
           {
             for(int col=1;col<row; col++)
             {
               System.out.print(" ");
             }
             for(int col=3;col>=row;col--)
             {
              System.out.print("*");
              
             }
             for(int col=2;col>=row;col--)
             {
               System.out.print("*");
             }
            System.out.println(); 
           }
       }
       
       public static void main(String args[]){
       
          pat2 me=new pat2();
            me.main();
       }
 }
 
 /*public class pat2{
    void main(){
         for(int row=1;row<=3;row++)
           {
            for(int col=1;col<=row;col++)
                {
                   System.out.print("*");
                  }              
                  
                 System.out.println();
                  }
              
              
                for(int row=1;row<=3;row++)
           {
            for(int col=3;col>=row;col--)
                {
                   System.out.print("*");
                  }              
                  
                 System.out.println();
                  }
               }
               
     public static void main(String arg[]){
        pat2 me=new pat2();
         me.main();
          }
       }
*/
