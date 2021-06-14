package CoreJavaLab2;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("User Turns to choose Rock=>'R',Paper=>'P',Scissor=>'S': ");
		String userplays=sc.nextLine().toUpperCase();
		
		String computerplays="None";
		Random gen=new Random();
		int computerInt=gen.nextInt(3);
		
		
		switch(computerInt) {
		case 0:
			computerplays="R";
			break;
		case 1:
			computerplays="P";
			break;
		case 2:
			computerplays="S";
			break;
		}
		System.out.println("Computer Turns : "+computerplays);
		if(userplays.equals(computerplays)) {
			System.out.println("Match is tie");
		}else if(userplays.equals("R")) {
			if(computerplays.equals("S")) {
				System.out.println("Rock crashes scissor You Won!");
			}else {
				System.out.println("You Lose");
			}
		}else if(userplays.equals("P")) {
			if(computerplays.equals("R")) {
				System.out.println("Rock doesn't cracks paper You Won!");
			}else {
				System.out.println("You Won!");
			}
		}else if(userplays.equals("S")) {
			if(computerplays.equals("P")) {
				System.out.println("Scissor will cut a paper into pieces You WON!");
			}else {
				System.out.println("You Lose!");
			}
		}else {
			System.out.println("Something Went Wrong");
		}
	}

}
