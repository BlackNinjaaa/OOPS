class Chaki
{
  String a="Dairy";  
}

class chacolate extends Chaki
{
void raper(){
String a="Milk";

System.out.println(super.a+" "+a);
}
}

public class Super_key
{
public static void main(String args[])
{
chacolate product= new chacolate();

product.raper();
}
}



