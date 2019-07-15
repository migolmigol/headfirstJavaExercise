package chapter3;

public class Triangle {

	double area;
	int height;
	int length;
	
	public static void main(String[] args) {
		
		int x = 0;		
		Triangle[] ta = new Triangle[4];
		
		while (x < 4) {
			ta[x] = new Triangle();
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			System.out.println("triangle " + x + ", area = " + ta[x].area);
			x = x + 1;		
		}
		
	
		x = 27;
		int y = x;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.println("y = " + y + ", t5 area = " + t5.area);
		
	}
	
	void setArea() {
		area = (height * length) / 2;		
	}
}
