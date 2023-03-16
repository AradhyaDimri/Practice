package pss;

public class throwexception {
    
    
	public static void main(String[] args) {
		
		int i=2;
	    int j=0;
		try {
	    	j=8/i;
	    	if(j==4)
	    	throw new ArithmeticException();
	    }
	    catch(ArithmeticException e ) {
	    	System.out.println("Exception"+e);
	    }
	    System.out.println("Working " +j);
	}

}
