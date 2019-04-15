class lab2task5{
	public static void main(String[]args){

	int a = 12, b = 25, c = 35 , d = 212 , result ;
    	
    	result = a | b ;
    	System.out.println(result);

        result = a & b ;
    	System.out.println(result);
    	    	
    	result = ~ c;
    	System.out.println(result);
    	
    	result = a ^ b;
    	System.out.println(result);

    	System.out.println(d << 1);
    	System.out.println(d << 0);
    	System.out.println(d << 4);
    	
    	System.out.println(d >> 1);
    	System.out.println(d >> 0);
    	System.out.println(d >> 8);

       	System.out.println(a >> 1);
    	System.out.println(a >>> 1);
       	System.out.println(b >> 1);
      	System.out.println(b >>> 1);
	}
}



