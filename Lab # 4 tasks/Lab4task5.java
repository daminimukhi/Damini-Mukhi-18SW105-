class Lab4task5
{
 public static void main(String[]args)
 {
   int [] arr = new int [3];
   arr[0] = 200 ;
   arr[1] = 300 ;
   arr[2] = 400 ;

   if(arr[0] > arr[1] && arr[0] > arr[2])
   {
    System.out.println(arr[0]);
   }
   if(arr[1] > arr[0] && arr[1] > arr[2])
   {
    System.out.println(arr[1]);
   }
   if(arr[2] > arr[0] && arr[2] > arr[1])
   {
    System.out.println(arr[2]);
  }
}
}