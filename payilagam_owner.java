/* class owner
{ 
 void main(){ 
   String new_course="web engineering";
  int course_fee=30000;
  {
  System.out.println("New course:"+new_course+"\n"+"Course fees:"+course_fee); 
  }
  
}
                                                   //single inheritance
}

class Admin extends owner // extends is a keyword of inheritance in java

{ 
 void detail1(){ 
 String course_timing="9am" ; 

  String course_duration="3 months"; 
 
  
  {
    System.out.println( "Course duration:"+course_duration+"\n"+"Course Timing:"+course_timing);
  } 
  }
  }
  
public class payilagam_owner
{
public static void main(String args[])

{   
  Admin course= new Admin();
    course.main();
   course.detail1(); //call the main method 
   
 } 
 
 } */
  
  
   class owner
{ 
 void main(){ 
   String new_course="web engineering";
  int course_fee=30000;
  {
  System.out.println("New course:"+new_course+"\n"+"Course fees:"+course_fee); 
  }
  
}

}

class Admin extends owner // extends is a keyword of inheritance

{ 
 void detail1(){ 
 String course_timing="9am" ; 

  String course_duration="3 months"; 
 
  
  {
    System.out.println( "Course duration:"+course_duration+"\n"+"Course Timing:"+course_timing);
  } 
  }
  }
                                           //multilevel
class trainer extends Admin 
{
  void instruct()
  {
  
  String topics="html,php,SQL,js";
   { 
    System.out.println("Topics :" +topics);
   }
}
}
  
public class payilagam_owner
{
public static void main(String args[])

{   
  trainer course= new trainer();
    course.main();
   course.detail1(); //call the main method 
   course.instruct();
   
  }
} 

/*
  
   class owner
{ 
 void main(){ 
   int trainer_salary =30000;
  
  {
  System.out.println("Trainer Salary: "+trainer_salary); 
  }
  
}

}

class trainer1 extends owner // extends is a keyword of inheritance

{ 
 void sal1() 
  {
          System.out.println();
 
      }
  
  }
  
  class trainer2 extends owner // extends is a keyword of inheritance

{ 
 void sal2()
      {
      
              System.out.println();             
      }
  
  }
  
public class payilagam_owner
{
public static void main(String args[])

{   
  trainer1 fees= new trainer1();
   fees.main();
   fees.sal1(); //call the main method
   
   trainer2 fee=new trainer2();
   fee.main();
   fee.sal2(); 
   
  }
}
  */


  

