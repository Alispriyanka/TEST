package TEST;
//
public class Nonreapetedchar {
 public static void main(String arg[]) {
	 String s="stress";
	 char a[]=new char[s.length()];
      for(int p=0;p<a.length;p++) {
    	  a[p]=s.charAt(p);
      }
	 for(int i=0;i<a.length;i++) {
    	 for(int j=1+i;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 a[j]=' ';
    		 }}
    		 for(int k=a.length-1;k<=1;k++) {
    			 if(a[i]!=a[k])
    			 System.out.print(a[k]);
    		 }
    	 
    		 
    	 }  		 
}}
