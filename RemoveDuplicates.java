package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		
		String input ="We learn java basics as part of java sessions in java week1";
		String[] a= input.split(" ");
        for(int i=0;i<a.length;i++) 
        {
    	   if (a[i]!=null)
    	   {
    		   for (int j=i+1;j<a.length;j++)
    		   {
    			   if(a[i].equals(a[j]))
    				   
    			   {
    				   a[j]=null;
    			   }
    		   }}}
    		  for(int k=0;k<a.length;k++) 
    		  {
    			  if(a[k]!=null)
    			  {
    				  System.out.println(a[k]);
	}
}}}