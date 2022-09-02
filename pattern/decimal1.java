public class decimal1{
      void main(){
      int a=1;
          
      for(int row=1;row<=4;row++)     //a=1,   1  a=1+4=5 ; // 5 a=5+4=9 // 9 
      { 
           a=row;
           
        for(int col=1;col<=3;col++)
        {             
           System.out.print(a);
           
           a=a+4;
      }
      
      System.out.println();   
      
      }
      }
      
     public static void main(String args[]){
     
        decimal1 me=new decimal1();
        me.main();
     
     } 
      
     
}
