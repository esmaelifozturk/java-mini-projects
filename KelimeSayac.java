package projeler;

import java.util.Scanner;

public class KelimeSayac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the text: ");
		String text = scan.nextLine();
		String pieces[] = text.split(" ");
		
		int counter = 0;
		for(String textPieces : pieces) {
			System.out.println(textPieces);
			counter++;
		}
		
		System.out.println("word count: " + counter);

	}

}

