
public class Amy {



 void main() {
        int a=153;
        int  amy=0,sum=0;
        while (a>0)
        {
        	sum=a%10;
        	a=a/10;
        	amy=(sum*sum*sum)+amy; //amstrong finding logic 
        			
        }
        System.out.println(amy);
 }

	public static void main(String[] args) {
          Amy Obj=new Amy();
          Obj.main();// TODO Auto-generated method stub

	}
	
	}
