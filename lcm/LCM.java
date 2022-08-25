 public class LCM{
 
  void find()
  {
    int first=8 , second=12 ,lcm=0;
    int large=(first>second)? first:second; //ternary oprator to validate the true or false
    
      while(true) //loop will execuite till find the common least value
      {
        if(large%first==0 && large%second==0)
        {
          lcm=large; // give the large value to lcm
         break;
        }
   large++;  } //loop
      
      System.out.println(lcm);
      
    }//method
  
  
  
  public static void main(String args[])
  { 
    LCM me=new LCM();
    me.find();
  }
}
