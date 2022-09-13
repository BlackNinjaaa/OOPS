public class Office 
{

   int id_no;
   String name;
   String job;
   
   static String drink="Drink coffee anyone";
   static String time ="Strictly office time is 9AM"; //this is static variable to call all list
   
  /* static void pick()
   {
     System.out.println("hello");
   } */
   
   void worker()
   {
     System.out.println("Id_no : "+id_no+"\n"+ "Name : "+name +"\n"+ "Job : "+job + "\n"+"drink:"+drink +"\n"+"time:"+time+"\n");
   }
  
  
  
  public static void main(String args[])
  {
    Office worker1=new Office ();
    worker1.id_no=2727;
    worker1.name="hari";
    worker1.job="Front end developer";
    worker1.worker();
    //pick();
    
    
    
    Office worker2=new Office ();
    worker2.id_no=2737;
   worker2.name="seai";
    worker2.job="back end developer";
     worker2.worker();
    
    
  }
}
