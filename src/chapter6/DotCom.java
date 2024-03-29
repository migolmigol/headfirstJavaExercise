package chapter6;

import java.util.*;

public class DotCom {
	
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String status = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouck! You sunk " + name + " :(");
			} else {
				status = "hit";
			}
		} // close if
		
		return status;
		
	} // close checkYourself method

}
