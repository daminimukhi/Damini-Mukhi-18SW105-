class lab2task2{
	public static void main(String[] args) {
		
    	int x = 1, y = 2,  z = 9;
    	boolean result;
    	result = (x > y) || (z > x);
    	System.out.println(result);	
    	result = (x > y) && (z > x);
    	System.out.println(result);

    	if (x > y)
    	{
    		System.out.println("x is greater than y");
    	}
    	else
    	{
    		System.out.println("y is greater than x");
    	}
    }

}
