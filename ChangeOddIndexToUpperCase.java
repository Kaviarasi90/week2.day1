package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		 String a = "changeme"; 
		  
		    StringBuffer b = new StringBuffer(); 
		   
		    char[] c = a.toCharArray(); 
		    
		    for (int i = 0; i < c.length; i++) { 
		    
		      char d = c[i]; 
		      
		      if (i % 2 != 0) { 
		       
		        d = Character.toUpperCase(d); 
		      } 
		      
		      b.append(d); 
		    } 
		    System.out.println(b); 
		  } 
		}