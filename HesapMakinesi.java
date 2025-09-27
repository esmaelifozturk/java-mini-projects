package projeler;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk Sayıyı Giriniz: ");
		double sayi1 = scan.nextDouble();
		System.out.print("\nİkinci Sayıyı Giriniz: ");
		double sayi2 = scan.nextDouble();
		System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
		System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
		System.out.println("Seçiminiz: ");
		double secim = scan.nextDouble();
		
		if(secim == 1) {
			double islem1 = sayi1 + sayi2; 
			System.out.println("Toplam: " + islem1);
		}else if(secim == 2) {
			double islem2 = sayi1 - sayi2;
			System.out.println("Çıkan: " + islem2);
		}else if(secim == 3) {
			double islem3 = sayi1 * sayi2;
			System.out.println("Çarpım: "+ islem3);
		}else if(secim == 4) {
			if(sayi2 == 0) {
				System.out.println("İkinci sayı 0'a eşittir ve sonuç belirsizdir"); }
			else if((sayi1 == 0) && (sayi2 == 0)) {
				System.out.println("İki sayı da 0'a eşittir ve sonuç tanımsızdır");
			}else {
			double islem4 = sayi1 / sayi2;
			System.out.println("Bölüm: " + islem4);
			} 
		}
		
		
		
				

	}

}
