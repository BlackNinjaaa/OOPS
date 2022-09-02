interface Ac_remote
{
  public void power_on();
   public void power_off();   //interface method 
   public void swing_mood(); // when the interface cannot create a object 
   public void speed();
}

//abstract class 
abstract class AC_discription 
{
    void usage_time()
  {
   System.out.println("5000mah per day");
  } 
  abstract void battery_insert();
  

} 


 class Hitachi extends AC_discription  implements Ac_remote  
{
    public void power_on()
   {
     System.out.println("power on button fixed ");    
   }
   
    public void power_off()
   {
   System.out.println("power off button fixed ");
   }
   
    public void swing_mood()
   {
     System.out.println("Swing mood fixed working properly");
   }
    public void speed()
   {
     System.out.println("Speed button fixed it's working good");
   }
  
   public void battery_insert()
   {
     System.out.println("4000 mah battery was inserted");
   }
 }
 
 public class AC_Remote{
 public static void main(String args[])
 {
   Hitachi Obj=new Hitachi();
   Obj.power_on();
   Obj.power_off();
   Obj.swing_mood();
   Obj.speed();
   Obj.usage_time();
   Obj.battery_insert();
   //AC_discription Obj2=new Hitachi();  
 }
 }
