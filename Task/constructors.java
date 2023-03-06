package Task;
class Takk
{
	private int age;
	private String name;
	
	public Takk() //no return type constructor
	{
		age=2;
		name="ASH";
	}
	
	public Takk(int a,String b) //no return type constructor
	{
		age=a;
		name=b;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class constructors {
	public static void main(String args[]) {
	Takk obj=new Takk();
	Takk obj2=new Takk(3,"fROST");
	
	System.out.println(obj.getAge()+":"+obj.getName());
	System.out.println(obj2.getAge()+":"+obj2.getName());
}
}
