/* public class checking{
void main(){
  int n=124;
  
  for(int i=1; i<=124;i++)
  {
  System.out.println(i);   //print 1 to 124 
  }
}
public static void main(String args[])
{
  checking siva=new checking();
  siva.main();
}

}*/

/* public class checking{
void main(){
  int n=1;
  
  for(int i=124; i>=n;i--)
  {
  System.out.println(i);   //print reverse 124 to 1
  }
}
public static void main(String args[])
{
  checking siva=new checking();
  siva.main();
}

}*/

/*public class checking{
void main(){
  int n=124;
  
  for(int i=1; i<=124;i++)
  {
  if(i%2==0)
  {                        // printing even number from 1 to 124
  System.out.println(i);
  }
}
}
public static void main(String args[])
{
  checking siva=new checking();
  siva.main();
}

}*/

/*public class checking{
void main(){
  int n=124;
  
  for(int i=1; i<=n;i++)
  {
  if(i%2 !=0)                  //printing odd number from 1 to 124
  {
  System.out.println(i);
  }
  
  }
}
public static void main(String args[])
{
  checking siva=new checking();
  siva.main();
}

}
*/

public class checking{
void main(){
  for(int n=1;n<=124/2;n++)
  {
     int count=0;
  for(int i=1;i<=n;i++)
  {
    
    if(n%i==0)      // print the prime all prime number in btw the 1 to half of 124.
    
   {count++;
   
   }
   
   }
    if (count==2)   
     {
     System.out.println(n+" prime");
      }
  
  
  }
}

public static void main(String args[])
{
  checking siva=new checking();
  siva.main();
}

}
