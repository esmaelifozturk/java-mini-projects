
import java.util.Scanner;

public class SayıTahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = (int)(Math.random()*101);
		compareNumbers(number);
		

	}
	
	public static void compareNumbers(int number) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number between 0 and 100: ");
		int usersNumber = scan.nextInt();
		boolean durum = false;
		int chance = 5;
		for(int i=0; i<5; i++) {
			if(number == usersNumber) {
			durum = true;
			System.out.println("you have guessed the number correct!");
			break;
			}else {
			System.out.println("you have guessed the number wrong. number of remaining chances: " + (chance - (i+1)));
			if(i<4) {
			System.out.println("enter a number again: ");
			int usersNumber2 = scan.nextInt();
			}
			}
		}
		if(!durum) { 
			System.out.println("You have used all your chances and couldn't find the number! The number was: " + number);
		}
		
	}
	

}

