class Lab4task7
{
  public static void main(String args[])
  {
      int temp = 0;
      int ptr,k;
      int data[] = {10,9,8,7,6};
      int N = data.length;
      for(k=1 ; k < N ; k++)
    {
      ptr=0;
      while(ptr < N-k)
        {
         if(data[ptr] > data[ptr + 1])
           {
            temp = data[ptr];
            data[ptr] = data[ptr + 1];
            data[ptr + 1] = temp;
		   }

		     ptr = ptr + 1;
	   }

    }
		 for( k=0 ; k < N ; k++)
		{
          System.out.print(data[k] + " ");
		}
  }
} 