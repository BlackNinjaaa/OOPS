class Kfc 
{
  Kfc()// constructor
  {
    System.out.println("> Drinking water is provided");
  }
  
  Kfc(int amount)
  {
    this();
    System.out.println("> pick a one combo pack above 500 and get a one cool drink free");
  }
  
  Kfc(int amount , long coupon_code)
  {
    this(1000);
    System.out.println("> 2 cool drink free for buy above 1000 and if you have a coupon code then you have a 50 % discount");  }
}

class Gindi_Kfc extends Kfc
{
    Gindi_Kfc()
    {   super(1000 , 92891); // it will goes to above Kfc
       System.out.println("> 10% discount for every combo pack");
    
    }

}
public class Restarunt{ 

public static void main(String args[])
{
   Gindi_Kfc Buy = new Gindi_Kfc();

}
}
