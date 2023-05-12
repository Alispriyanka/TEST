package TEST;

public class largenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {8,6,0,4,6,4,2,0};
for(int i=0;i<a.length;i++) {
	 for(int j=1+i;j<a.length;j++) {
		 if(a[i]<a[j]) {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }}}
	 for(int k=0;k<a.length;k++) {
	 System.out.print(a[k]);
	}


}}
