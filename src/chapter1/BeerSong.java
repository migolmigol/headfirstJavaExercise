package chapter1;

public class BeerSong {
	
	public static void main(String[] args) {
		
		int beerNum = 99;
		String word = "bottles";  //복수형
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";  //단수형
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			beerNum = beerNum - 1;
			
			if (beerNum == 0) {
				System.out.println("No more bottles of beer on the wall");
			} // if문 끝
		} // while문 끝
	} // main 클래스 끝

}
