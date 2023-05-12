package TEST;

public class Recursion {

	 static void tt(int i) {
		// TODO Auto-generated constructor stub
		if(i<=5) {
			int fact=1;
			fact=fact*i;
		
			System.out.println(fact);
		}
		tt(i+1);
	}
public static void main(String[]arg) {
	Recursion.tt(1);
}
}
