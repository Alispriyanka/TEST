package TEST;

public class Notrepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="abcdab";
char b[]=a.toCharArray();
for(int i=0;i<b.length;i++) {
	
	for(int j=i+1;j<b.length;j++) {
		if(b[i]==(b[j])) {
			b[j]=' ';
		}
		//System.out.print(b[j]);	
		}}
		for(int k=0;k<b.length;k++) {
			if(b[k]!=' ')
			System.out.print(b[k]);
		
	
	
}
	}

}
