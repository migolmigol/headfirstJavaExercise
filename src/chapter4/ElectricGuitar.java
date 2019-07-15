package chapter4;

public class ElectricGuitar {
	
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;
	
	String getBrand() {
		return brand;
	}

	void setBrand(String aBrand) {
		brand = aBrand;
	}
	
	int getnumOfPickups() {
		return numOfPickups;
	}
	
	void setnumOfPickups(int num) {
		numOfPickups = num;
	}
	
	Boolean getrockStarUsesIt() {
		return rockStarUsesIt;
	}
	
	void setrockStarUsesIt(boolean yesOrNo) {
		rockStarUsesIt = yesOrNo;
	}
	
}
