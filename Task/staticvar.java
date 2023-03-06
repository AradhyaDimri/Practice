package Task;


	
	class Mobile{
		String brand;
		int price;
		static String name;
		
		public void show() {
			System.out.println(brand +":" + price +":" + name);
		}
	}
		
		public class staticvar{
	public static void main(String[] args) {
		Mobile obj1=new Mobile ();
		
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile.name="SmartPhone";
		//Mobile.name="SmartPhone"//can be assesed directly by using class name
		
		
		Mobile obj2=new Mobile ();
		obj2.brand="Samsung";
		obj2.price=1700;
		Mobile.name="SmartPhone";
		
		
		//obj1.name="phone";//if you change any object value it will effect both object as it is static
		obj1.show();
		obj2.show();
		
		
	}
	}


