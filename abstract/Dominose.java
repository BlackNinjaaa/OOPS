 abstract class Domoffice
{
 public abstract void dom_info(); //abstract method
 
 protected final void ingredients()   //this things are should be protected // implemented method
 {
    String flour="wheat";
   String oil="oliveoil";
 System.out.println("flour:"+flour +"\n"+"oil:"+oil+"\n");
 
 }
 protected abstract void uniform();  //abstract method 
 private void manager_salary() 
 {
   System.out.println("232323223");	 
 }
}

 class Valecherry extends Domoffice
{
  protected void uniform()
  {
	  System.out.println("uniform in t-shirt and pant with color of blue and red");
  }
  public void dom_info()
  
  {
   System.out.println("Available foods & cool Drinks");	 
 }
}
public class Dominose {

public static void main(String[] args) {
		Domoffice Obj=new Valecherry();
		Obj.dom_info();
		Obj.ingredients();
                Obj.uniform();
                //Obj.manager_salary();
                
	}
}

