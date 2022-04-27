package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String a = "I am a software tester"; 
		String[] b = a.split(" ");
		String c ="";
		for(int i=0;i<b.length;i++)
		{
			if(i%2==1)
				c = c + new StringBuilder(b[i]).reverse().toString() +" ";
			else
				c = c + b[i] + " ";
		}
		System.out.println(c);
		}
	}

