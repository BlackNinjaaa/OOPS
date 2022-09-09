class Grt
{
  Grt() // zero argument constructor 
  {
    System.out.println("calender");
  }
  
  Grt(double amt)
  {
    this();  // before values inherit
    System.out.println("bag given");
  }
}

class valachery_Grt // extends Grt
{
   valachery_Grt ()
   {  //super(23);
     
     System.out.println("1000 Rs discount");
   }
   
}
public class GRT{
public static void main(String args[])
{  
   valachery_Grt s1=new valachery_Grt();
           
}
}
