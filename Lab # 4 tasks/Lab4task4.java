class Lab4task4 
{
  public static void main(String[]args)
	{

   int sum[][] = new int[4][5];
   int[][] a = { {2, 3, 4}, {5, 6, 7} };
   int[][] b = { {4, 5, 6}, {7, 8, 9} };
   for(int i = 0 ; i < a.length ; i++)
   {
     for (int j = 0 ; j < b.length ; j++) 
   {

     sum[i][j] = a[i][j] + b[i][j]; 
     System.out.print(sum[i][j] + " ");
    }
    System.out.println();
  }
}
} 

	
