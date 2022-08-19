 class Payilagam
{ 
void main(){ 
   String new_course="web engineering";
  int course_fee=30000;
  {
  System.out.println("New course:"+new_course+"/n"+"Course_fee:"+course_fee);
  }
  
}

}

class Admin extends Payilagam

{ 
void detail1(){ 
 String course_timing="9am" ; 

  String course_duration="3 months"; 
 
  
  {
    System.out.println("Course duration:"+course_duration+"/n"+"Course Timing:"+course_timing);
  } 
  }
  }
  
public class payilagam_owner{
public static void detail1(String args[])

{   
  Admin course= new Admin();
   course.detail1();
    course.main();
  }
}
  

