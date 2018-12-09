package numberToConvertText;

import java.util.HashMap;
import java.util.Map;

public class NumberToText {
	
	// Muhammet Feyzi Sa�lam
	// Bu s�n�f yap�sn� collection veri yap�s� yard�m�yla olu�turdum.
	// birler basama��ndaki rakamlar�n string olarak ifade edilnmesinde DigitConvertToWord kolleksiyounundan yararlan�yorum
	// onlar basama�� i�in  DecadesConvertToWord kollesiyonunu kullan�yorum
	// y�zler basama�� i�in  HundredsConvertToWord kolleksiyounun kullan�yorum
	// integer olarak parametre alan ifadeyi string olarak yazabilmek i�in integerToWordParser Metodunu kulland�m.

	// Test driven test case de sadece ana fonksiyonu dahil ettim
	// her fail alan test case sonucnda gerekli fonksiyon iplementasyonlar�n� sa�lad�m . . .
	
	public static String text=""; // global variable 
	public static String integerToWordParser(int number) {
		if(number>=0 && number <10) {
			// birler basama�� d�ner
			return DigitConvertToWord.get(number);
		}
		else if(number >=10 && number<20)
		{
			// 10 ile 20 aras�ndaki say�lar
			return TwoDecadeConvertToWord.get(number);
		}
		else if(number >=20 && number <100)
		{
			// 20 den b�y�k iki basamakl� say�lar
		    if(number %10 == 0)
		    {
		    	// beklenen de�erler 20,30,40,50,60,...90
		    	return text = DecadesConvertToWord.get(number/10);
		    }
		    else {
		    	             // onlar basama�� + " " + birler basama��
		    	return text = DecadesConvertToWord.get(number/10) + " "+ integerToWordParser(number%10);
		    }
		}
		else if (number >=100 && number<1000) {
			if(number %100 == 0) {
				return text = HundredsConvertToWord.get(number/100);
			}
			else {
				return text =  HundredsConvertToWord.get(number/100) + " and " + integerToWordParser(number%100);
			}
		}
		else {
			if(number % 1000 == 0) {
				return text = ThousandsConvertToWord.get(number/1000);
			}
			else {
				
				return text = ThousandsConvertToWord.get(number/1000) + " and " + integerToWordParser(number%1000);
			}
			 
		}
		
	}
	
	public static Map<Integer, String> DigitConvertToWord = new HashMap<Integer, String>(){
		{
			put(1,"one");
		    put(2,"two");
			put(3,"three");
		    put(4,"four");
		    put(5,"five");
		    put(6,"six");
		    put(7,"seven");
		    put(8,"eight");
		    put(9,"nine");

		}
	};
	public static Map<Integer, String> TwoDecadeConvertToWord = new HashMap<Integer, String>(){
		{
			put(12,"twelve");
			put(13,"thirteen");
			put(14,"fourteen");
			put(15,"fifteen");
			put(16,"sixteen");
			put(17,"seventeen");
			put(18,"eighteen");
			put(19,"nineteen");
		}
	};
	public static Map<Integer, String> DecadesConvertToWord = new HashMap<Integer, String>(){
		{
			
			put(2,"twenty");
			put(3,"thirty");
			put(4,"forty");
			put(5,"fifty");
			put(6,"sixty");
			put(7,"seventy");
			put(8,"eighty");
			put(9,"ninety");
			
		}
	};
	
	public static Map<Integer, String> HundredsConvertToWord = new HashMap<Integer, String>(){
		{
			put(1,"one hundred");
			put(2,"two hundred");
			put(3,"three hundred");
			put(4,"four hundred");
			put(5,"five hundred");
			put(6,"six hundred");
			put(7,"seven hundred");
			put(8,"eight hundred");
			put(9,"nine hundred");
		}
	};
	public static Map<Integer, String> ThousandsConvertToWord = new HashMap<Integer, String>(){
		{
			put(1,"one thousand");
			put(2,"two thousand");
			put(3,"three thousand");
			put(4,"four thousand");
			put(5,"five thousand");
			put(6,"six thousand");
			put(7,"seven thousand");
			put(8,"eight thousand");
			put(9,"nine thousand");
		}
	};
	
}
