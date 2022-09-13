public class Employee
{
  private String name ;
  private String Qualification;
  private long Mobile_no;
  
  void display()
  {
    System.out.println(getname()+" "+getQualification()+" "+getMobile_no());
  }
  
  Employee(String name , String Qualification , long Mobile_no)
  
  {
     this.name=name;
     this.Qualification=Qualification;
     this.Mobile_no=Mobile_no;
  }
  
  
  
  public String getname()
  {
    return name;
  }
  public String getQualification()
  {
  System.out.println(Qualification);
    return Qualification;
    
  }
  public long getMobile_no()
  {
    return Mobile_no;
  }
   
  
  public void setname(String name)
  {
   this.name=name;
  }
  public void setQualification(String Qualification)
  {
  
    this.Qualification=Qualification;
  }
  public void setMobile_no(long Mobile_no)
  {
    this.Mobile_no=Mobile_no;
  }
  
  public static void main(String args[])
  {
    Employee ram = new Employee("ram","BCA",9877574553l);
  
    // ram.display();
     ram.setname("sri");
    // ram.display();
     ram.getQualification();
  }
  
}
