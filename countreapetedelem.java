package TEST;

public class countreapetedelem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ALISPRIYANKA";
		String s1="";
		char a[]=new char[s.length()];
	      for(int p=0;p<a.length;p++) {
	    	  a[p]=s.charAt(p);
	      }
	      for(int i=0;i<a.length;i++) {
	    	  int count=1;
	    	  for(int j=i+1;j<a.length;j++) {
	    		  if(a[i]==a[j]) {
	    			  count++;
	    			  a[j]='0';
	    		  }
	    	  }
	    	  if(a[i]!='0')
	    	  {
	    		  System.out.println(a[i]+" : "+count);
	    	  }
	      }
		 
}
}