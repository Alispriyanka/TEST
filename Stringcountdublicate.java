package TEST;

public class Stringcountdublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"aa","bb","aa","dd","cc","dd"};
		String dup1="";
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					dup1=a[i];
					 count++;
					 System.out.println(dup1+":"+count);
				}}}
	}

}
