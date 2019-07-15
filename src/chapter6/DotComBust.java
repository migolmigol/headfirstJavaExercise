package chapter6;

import java.util.*;

public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// 우선 닷컴 객체 몇 개를 만들고 위치를 지정
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		} // for 문 끝
		
	} // setUpGame() 메소드 끝

	private void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		} // while 문 끝
		
		finishGame();
		
	} // startPlaying 메소드 끝
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		} // for 문 끝
		
		System.out.println(result);
		
	} // checkUserGuess 메소드 끝
	
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough." + numOfGuesses + "guesses");
			System.out.println("Fish are dancing with your options.");
		}
	} // close method
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	} // close main method
}
