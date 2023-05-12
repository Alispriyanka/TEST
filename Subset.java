package TEST;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {4,1,2,3};
     int b[]= {5,4,7,8};
     for(int i=0;i<a.length;i++) {
       for(int j=0;j<b.length;j++) {
    	   if(a[i]==b[j]) {
    		   System.out.println(b[j]);
    	   }
    	   
       }
     }
	}

}
