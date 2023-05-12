package TEST;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		char a[]=new char[s.length()];
	      for(int i=0;i<a.length;i++) {
	    	  a[i]=s.charAt(i);
	      }
	      for(int j=a.length-1;j>=0;j--) {
             
	      
	      System.out.print(a[j]);
	      }
}}
