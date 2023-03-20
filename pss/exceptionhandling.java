package pss;

public class exceptionhandling {
	 public static void main(String args[]){  
		 try{    
			 
              //String str=null;
             
            // System.out.println(str.length());
              int a=50/0;   
              //int b[]=new int[5];
              //b[5]=9;
             
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println(e);  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
		    catch(NullPointerException e)  
               {  
                 System.out.println("NullPointer Exception occurs");  
                }  
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  
}  