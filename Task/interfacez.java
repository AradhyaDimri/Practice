package Task;
interface ak{
	void run();
	
}
class bk implements ak{
	public void run() 
	{
		System.out.println("b running");
	}
}
public class interfacez {

	public static void main(String[] args) {
		bk obj =new bk();
		obj.run();

	}

}
