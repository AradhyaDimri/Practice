package Task;
class Calculator{
	
	public int add(int a,int b)
	{
		int r=a+b;
		
		return r;
	}
}
public class Demo {

	public static void main(String[] args)
	{
		int num1=4;
		int num2=5;
		
		
		Calculator sc1=new Calculator();
		int result=sc1.add(num1,num2);
		System.out.println(result);
	}
	
	
	
}

	