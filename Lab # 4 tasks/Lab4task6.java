class Lab4task6
{  
  public static void main(String[] args)
	{ 
	  int sec = Integer.parseInt(args[0]);
	  int k = 0;
      int num[] = {1, 2, 3 };      
      for (int j = 0 ; j < num.length ; j++) 
       {
           if (sec == num[j]) 
           {
             System.out.println(" is found " + (j + 1));
             k++;
           } 
        } 

       if(k == 0)
       {
         System.out.println(" Not found ");
       }
    }
}