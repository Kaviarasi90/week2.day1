package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "stops";
		String b = "potss"; 
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()==b.length())
		{
			char[] c=a.toCharArray();
			char[] d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			
			if (Arrays.equals(c,d))
			{
				System.out.println(a + " and " + b + " are anagram."); 
				}
			else {
				System.out.println(a + " and " + b + " are not anagram.");
			}			
		}}}
