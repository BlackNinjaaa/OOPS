public class amstrong
{
  void find()
  { 
    int b=152;
    int amy=0;
    int sum=0,a=b;
    while(a>0)
    {
     
      sum=a%10;
      a=a/10;
      amy=(sum*sum*sum)+amy;
    
     }
    System.out.println(amy);
  
  if(b==amy)
  {
  System.out.println("This is amstrong number");
  }
  
  else
  {
    System.out.println("NOT");
  }
  }
  public static void main(String args[]){
  
  amstrong me=new amstrong();
  me.find();
  }
}
