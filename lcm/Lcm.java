/*public class Lcm
{
  void find()
  {
    int no1=9, no2 =10 , no3=7,LCM=0 ,max=0;
      {
            if(no1 > no2 && no1 > no3)

        {

            max=no1;

        }

        else if(no2 > no3)

        {

            max=no2;

        }

        else

        {

             max=no3;

        }

   while(true) {
         if(max%no1 ==0 && max%no2==0 && max%no3==0)
         {
            LCM=max;
            break;
         }
         max++;
    }
    }
    System.out.println(LCM);
    }
  public static void main(String args[])
  {
     Lcm me=new Lcm();
     me.find ();	
  }
  }
*/  

public class Lcm
{
  void find()
  {
    int no1=8, no2 =14 , no3=30,GCD=0 ,min=0;
      {
            if(no1 < no2 && no1 < no3)

        {

            min=no1;

        }

        else if(no2 < no3)

        {

            min=no2;

        }

        else

        {

             min=no3;

        }

   while(true) {
         if(no1%min ==0 && no2%min==0 && no3%min==0)
         {
            GCD=min;
            break;
         }
         min--;
    }
    }
    System.out.println(GCD);
    }
  public static void main(String args[])
  {
     Lcm me=new Lcm();
     me.find ();	
  }
  }

  

