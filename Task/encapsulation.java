package Task;

class Human{
	private int age=21;
	private String name="ASH";
	
	public int getage() {
		
		return age;
	}
	
	public void setage(int a) {
		age=a;
		
	}
	
public String getname() {
		
		return name;
	}
public void setname(String n) {
	name=n;
	
}
}



public class encapsulation {
	public static void main(String args[]) {
	Human obj=new Human();
	obj.setage(30);
	obj.setname("Ash");

		
	System.out.println(obj.getname()  + ":"+  obj.getage());	
		
	}
	

}
