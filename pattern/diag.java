public class diag{

void main()
{
  int row=1;
  while(row<=4)
  {
    int col=1;
    while(col<=4)
    {
    
    if(row==1 || row==4 || col==1 || col ==4)
   {   System.out.print(0);
    }
    else{ System.out.print(1);
       
           
    }
    col++;
     } 
      System.out.println();
   row++;
   }
}
 public static void main(String args[])
 {
   diag me=new diag();
   me.main(); 
 }
 


}
