package TEST;

public class Majarityelefin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[]={2,3,4,5,2,3,3,3,3};
	int max=0;
	int maxelement=0;
	 for(int i=0;i<a.length;i++) {
		 int count=1;
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 //max=a[j];
    			 count++;
    			 }
    		 }
    	 if(max<count)
    	 {
    		 max=count;
    		 maxelement=a[i];
    	 }
    	 
	}
	 System.out.println(maxelement+":"+max);	 
 
	}

}
