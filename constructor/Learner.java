public class Learner 
{
  int Id_no;
  int age;
  int Batch_no;
  String course ;
  char gender;
  long aadhar_no;
  
  protected void display ()
  {
    System.out.println("Id_no:"+Id_no+"\n"+"Age:"+age+"\n"+"Batch No:"+Batch_no+"\n"+"Course:"+course+"\n"+"Gender:"+gender+"\n"+"Aadhar:"+aadhar_no+"\n"); 
  }
  
 /* Learner() // Constructor (Non-parametarized constructor)
  {
    System.out.println("Welcome to our Institute");
  }
  
  Learner(int Id_no , int age , int Batch_no , String course , char gender) // Parametarized constructor 
  {
    this.Id_no = Id_no;
    this.age=age;                
    this.Batch_no = Batch_no;
    this.course = course;
    this.gender= gender;
  } 
  
  Learner(int Id_no , int age , int Batch_no , String course , char gender , long aadhar_no)
  {
  this.Id_no = Id_no;
    this.age=age;                
    this.Batch_no = Batch_no;
    this.course = course;
    this.gender= gender;
    this.aadhar_no = aadhar_no;
  
  } */
  
    public static void main(String args[])
  {
    Learner s1=new Learner();
    s1.display();
  }
}
