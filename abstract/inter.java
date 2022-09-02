interface Ac_remote
{
  public void power_on();
   public void power_off();   //interface method 
  
}

interface new_feature
{
 public void swing_mood(); // when the interface cannot create a object 
   public void speed();
}


 class Hitachi implements Ac_remote , new_feature //interface using comma to implement two interface
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
  
  
 }
 
 public class inter{
 public static void main(String args[])
 {
   Hitachi Obj=new Hitachi();
   Obj.power_on();
   Obj.power_off();
   Obj.swing_mood();
   Obj.speed();
     
 }
 }
