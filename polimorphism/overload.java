class Helper {
 
       void add(int a, int b)
 {
   int c= a+b;
   System.out.println(c);
 }
 
   void add(int a , int b , int c)
   
   {
     int d=a+b+c;
     System.out.println(d);
   }
 
    // Method with 2 integer parameters
    void Multiply(int a, int b)
    {
 
        int c=a*b;
        System.out.println(c);
    }
 
    // Method 2
    
    void Multiply(double a, double b)
    {
 
        double c = a*b;
        System.out.println(c);
    }
    
     
}
 public class overload {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Calling method by passing
       
       Helper am = new Helper();
        am.add(3,8);
        am.add(8,4,9);
        am.Multiply(6,10);
        am.Multiply(4.9,2.8);
    }
}
