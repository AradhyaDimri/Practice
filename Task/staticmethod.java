package Task;


	
	class Mobil
	{
		String brand;
		int price;
		static String name;
		
		public void show() {
			System.out.println(brand +":" + price +":" + name);
		}
		public static  void show1() {
			System.out.println("in static method");
		}
	}
	
	
public class staticmethod{
	public static void main(String[] args) {
		Mobil obj1=new Mobil ();
		
		obj1.brand="Apple";
		obj1.price=1500;
		Mobil.name="SmartPhone";
		obj1.show();
		Mobil.show1();//can be called directly

		
	}
	}