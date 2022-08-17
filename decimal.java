public class decimal {

void add()
{
  int i=1;
  int row = 1;
  while(row<=4)
  {
   int col=1;
   while(col<=4)
   {
     System.out.print(i);
      
      i=i+1;
      col++;
   }
  
  System.out.println();
  row++;
}
}
public static void main(String args[])
{
  decimal me=new decimal();
    me.add();
    }

}
