class Vehicle
{
  void moving()
  {  String vehicle ="Moving";
     
    System.out.println("Vehicle: "+vehicle);
  }
}

class bike extends Vehicle
{
  void Bike(){
    int wheel=2;
    String Break="hand break & foot break";
    String petrol="1-liter use to cross 45km";
    System.out.println("no of Wheels:"+wheel+"\n"+"Break:"+Break+"\n"+"Petrol:"+petrol+"\n");
  }
}
 
 class car extends Vehicle
 {
   void Car()
   {
     int wheel=4;
     String Break="foot break";
     String disel="1-liter use to cross 15km";
     System.out.println("no of Wheels:"+wheel+"\n"+"Break:"+Break+"\n"+"Disel:"+disel+"\n");
   }
 }
 
public class singleinheritance
{
  public static void main(String args[])
  {
    bike behave=new bike();
     behave.moving();
     behave.Bike();
     
     car behave1=new car();
      behave1.moving();
      behave1.Car();
     
  }
}
