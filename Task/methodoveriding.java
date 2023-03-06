package Task;
class Bike{
	void run()
	{
	System.out.println("Bike is Running");
}
}
class Vehicle extends Bike{
	void run()
	{
	System.out.println("Vehicle is Running");
	//super.run();
}
}


public class methodoveriding {

	public static void main(String[] args) {
		Vehicle sc=new Vehicle();
		sc.run();
        

	}

}
