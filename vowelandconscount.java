package TEST;

public class vowelandconscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="learn java payilagam";
int count=0,cons=0,wor=0;
char a[]=new char[s.length()];
for(int i=0;i<a.length;i++) {
	a[i]=s.charAt(i);
}
String []word=s.split(" ");
for(int i=0;i<word.length;i++) {
	wor=wor+1;
}
System.out.println("word:"+wor);
for(int i=0;i<a.length;i++) {
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
		count++;
	}
		//System.out.print(count);	

		else {
			//(a[i]!='a'||a[i]!='e'||a[i]!='i'||a[i]!='o'||a[i]!='u') {
			cons++;
		
		}}
        System.out.println("vowels:"+count);
		System.out.println("constonent:"+cons);

		
	
	}

}
