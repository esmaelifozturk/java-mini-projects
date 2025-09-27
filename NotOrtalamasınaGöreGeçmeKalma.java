package projeler;

import java.util.Scanner;

public class NotOrtalamasınaGöreGeçmeKalma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat, phy, itp;
		int midterm, ffinal, quiz;
		Scanner scan = new Scanner(System.in);
		System.out.println("Matematik vize notunuzu giriniz: ");
		midterm = scan.nextInt();
		System.out.println("Matematik final notunuzu giriniz: ");
		ffinal = scan.nextInt();
		System.out.println("Matematik quiz notunuzu giriniz: ");
		quiz = scan.nextInt();
		double matort = (midterm * 0.3) + (ffinal * 0.5) + (quiz * 0.2);
		
		System.out.println("Fizik vize notunuzu giriniz: ");
		midterm = scan.nextInt();
		System.out.println("Fizik final notunuzu giriniz: ");
		ffinal = scan.nextInt();
		System.out.println("Fizik quiz notunu giriniz: ");
		quiz = scan.nextInt();
		double phyort = (midterm * 0.3) + (ffinal * 0.5) + (quiz * 0.2);
		
		System.out.println("Itp vize notunuzu giriniz: ");
		midterm = scan.nextInt();
		System.out.println("Itp final notunuzu giriniz: ");
		ffinal = scan.nextInt();
		System.out.println("Itp quiz notunuzu giriniz: ");
		quiz = scan.nextInt();
		double itport = (midterm * 0.3) + (ffinal * 0.5) + (quiz * 0.2);
		double genelort = (matort * 0.4) + (phyort * 0.4) + (itport * 0.2);
		System.out.println(genelort);
		
		if(genelort < 50) {
			System.out.println("Sınıftan geçenediniz. ");
		}else {
			System.out.println("Sınıfı geçtiniz." );
		}

	}

}
