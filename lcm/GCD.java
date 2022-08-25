 public class GCD{
 
  void find()
  {
    int first=8 , second=24 ,GCD=0;
    int small=(first>second)? first:second; //ternary oprator to validate the true or false
    
      for(int i=1;i<=small;i++) //loop will execuite the till the small value find
      {
        if(first%i==0 && second%i==0)
        {
          GCD=i; // give the i value to the gcd
         
        }
     } //lood
      
      System.out.println(GCD);
      
    }//method
  
  
  
  public static void main(String args[])
  { 
    GCD me=new GCD();
    me.find();
  }
}
