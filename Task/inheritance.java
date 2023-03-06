package Task;
//single,multilevel and Hierarchical inheritance in one program
class a{
	void run() 
	{
		System.out.println("a running");
	}
}
class b extends a{
	void run2() 
	{
		System.out.println("b running");
	}
}
class c extends b{
	void run3() 
	{
		System.out.println("c running");
	}
}
class d extends c
{
	void run4() 
	{
		System.out.println("d running");
	}
}


public class inheritance {
 public static void main(String args[]) {
	 d s2=new d();
	 s2.run();
	 s2.run2();
	 s2.run3();
	 s2.run4();
 }
}
