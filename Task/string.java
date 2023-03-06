
package Task;

public class string {

	public static void main(String[] args) {
		//Concat
		String str1=" Aradhya";
		String str2="Dimri";
		str1=str1.concat(" Don");
		System.out.println(str1);
		//System.out.println("Hello " + str1 +  str2);
		
		
	    //Compare
		String str3="Kong";
		String str4="Kong";
		System.out.println(str3.equals(str4));//Compares the values 
		
		String str5=new String("Kong");//Created in non pool memory
		System.out.println(str3==str4);
		System.out.println(str3==str5);//Compares the reference
		
		System.out.println(str3.compareTo(str1));//Returns integer
		
		//Substring
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,6));
		
		//Uppercase Lowercase
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		//Trim
		System.out.println(str1.trim());//Extra Space Remove
		
		//Length
		System.out.println(str1.length());
		
		
		
		
		
		/*
		StringBuffer sb=new StringBuffer("Nathan");
		sb.append(" Gould");
		System.out.println(sb);
		*/
		/*
		StringBuilder sb1=new StringBuffer("Nathan");
		sb1.append(" Gould");
		System.out.println(sb1);
		*/
		
		
		
		
	}

}
