package heyBuddy;

import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random randNum = new Random();
		for( int i = 0; i < randNum.nextInt(10); i++){
			System.out.print("Your random number is: ");
			System.out.println(randNum.nextInt(10));
		}
		
		

	}

}
