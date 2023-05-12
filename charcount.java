package TEST;

public class charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="banana";
int b=0,n=0,m=0;
char a[]=new char[s.length()];
for(int i=0;i<a.length;i++) {
	a[i]=s.charAt(i);
}
for(int i=0;i<a.length;i++) {
	if(a[i]=='b') {
		b++;
	}
	//System.out.println(b);
	if(a[i]=='a') {
		m++;
	}
	//System.out.println(m);
	if(a[i]=='n') {
		n++;
	}}
	System.out.println("B"+b);
	System.out.println("N"+n);
	System.out.println("A"+m);



	}

}
