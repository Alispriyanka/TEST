package TEST;

public class Vowelsandconsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="habib";
int count=0;
int cons=0;
char a[]=new char[s.length()];
for(int i=0;i<a.length;i++) {
	a[i]=s.charAt(i);
}
for(int i=0;i<a.length;i++) {
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
		count++;
	}
		//System.out.print(count);	

		else {
			//(a[i]!='a'||a[i]!='e'||a[i]!='i'||a[i]!='o'||a[i]!='u') {
			cons++;
		
		}}
		System.out.println("constonent:"+cons);

		System.out.println("vowels:"+count);
	
	

	}

}
