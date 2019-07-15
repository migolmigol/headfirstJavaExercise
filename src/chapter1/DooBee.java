package chapter1;

public class DooBee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		while (x < 3) {
			System.out.print("Doo");
			System.out.print("Bee");
			
			x = x + 1 ;
		}
		
		if (x == 3) {
			System.out.println("Do");
		}
		
		System.out.println();
		
		
		double d = Math.random();
		int i = (int) d;
		
		System.out.println(d);
		System.out.println(i);
	}

}
