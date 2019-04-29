  import java.util.Scanner;
  class Lab3task2 
{
    public static void main (String[] args)
   {
      float a,b,c,d,total;
      Scanner user = new Scanner(System.in);
      System.out.println(" Enter units consumed: ");
      a = user.nextFloat();
      total = 0;
           for(int i = 0 ;  i <= a ; i++)
       {
            if(i >= 0 && i <= 50)
            {
              total = total + 10;
            }
 
            if(i > 50 && i <= 100)
            {
               total = total + 15;
                 
            }
            if(i > 101 && i <= 200)
            { 
                total = total + 20;
            }
            if(i > 201 && i <= 300)
            {
               total = total + 25;
            }
            if(i > 301)
            {
               total = total + 30;
            }
        }
          System.out.println("The total bill : " + total);
    }
}    
    
      
    