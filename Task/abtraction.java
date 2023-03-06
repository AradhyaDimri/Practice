package Task;

abstract class Animal{
	void run() 
	{}
}
class Zebra extends Animal{
	void run() 
	{
		System.out.println("Zebra running");
	}
}
public class abtraction {
 public static void main(String args[]) {
	 Animal s2=new Zebra();
	 s2.run();
	
 }
}