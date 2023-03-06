package pss;
class ash{
	 int a=20;
	 //final int a=20;//agar ider final kiya toh niche change nahi kar sakte ho
	void run(){
		 
		System.out.println("ash is stupid ");
		
	}
}
class bob extends ash{
	
	void run(){
		 a=90;
		System.out.println("bob is stupid ");
		System.out.println(a);
	}
}


public class finalvar {
	public static void main(String args[]) {
 bob sc=new bob();
  sc.run();
  
}
} 