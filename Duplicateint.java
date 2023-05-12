package TEST;

public class Duplicateint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,2,5,4};
     for(int i=0;i<a.length;i++) {
    	 for(int j=1+i;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 System.out.print(a[j]+",");
    		 }
    	 }
    	 
     }
	}

}
