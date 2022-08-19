class Admin
{
  void course_duration()
  {
    String course ="course will finish within a 3 months";
     System.out.println (course);
  }
}

class Trainer extends Admin
{
   void course_duration()
   {
     String course ="course is ended in 2 months";
     System.out.println(course);
   }
}
public class Overriding
{
  public static void main(String args[])
  {
     Admin B = new Trainer();
     B.course_duration();
  }
}
