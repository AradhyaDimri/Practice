package Task;

public class MehodOverloading {
	
	public static void main(String args[]) {
		
		
		
   MehodOverloading sc=new MehodOverloading();
		
System.out.println(sc.add(3,4,9))		;
		
	}
	
	public int add(int a,int b)
	{
		return a+b;
		
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	

}
