package numberToConvertText;

import java.rmi.NotBoundException;

public class BigNumberConvertToText {
	
	// Say�y� par�alayarak ilgili metoda g�nderiyorum. .
	// Test Driven yapmak i�in s�n�flar�m� public yaparak 
	// ilk �nce test case olu�turdum ve sonras�nda implementasyonunu yapt�m
	public static String NumberConvertToString(int number) {
		
		// integer say�larla �al��t���m i�in
		// 2,147,483,467 says�na kadar program�m desteklemektedir.
		// istenildi�i taktirde  32 bit int ded�erleir 64 bite �ekilerek
		//  daha b�y�k say� aral���n� kar��lar
		
		if(number <0) {
			return "neagtive numbers not supported";
		}else if(number == 0) {
			return "zero";
		}else if(number >0 && number< 10) {
			return DigitConvertToText(number);
		}else if(number>=10 && number<20) {
			return TeensConvertToText(number);
		}else if (number>= 20 && number <100) {
			return BigTensConvertToText(number);
		}else if (number >=100 && number < 1000) {
			return BigNumberConvertToString(number,100 , "hundred");
		}else if (number >=1000 && number <(int) 1e6) {
			return BigNumberConvertToString(number, (int)1e3, "thousand");
		}else if (number >= (int)1e6 && number <(int)1e9 ){
			return BigNumberConvertToString(number, (int)1e6, "million");
		}else if (number >= (int) 1e9 && number<(int)1e12) {
			return BigNumberConvertToString(number, (int)1e9, "billion");
		}else {
			return "number not bigger than 2,147,483,647 ";
		}
		
		
	}

	// digit Function number between 0 & 9
	public static String DigitConvertToText(int number) {
		switch (number) {
		case 0:
		 return " ";
		case 1:
			 return "one";
		case 2:
			 return "two";
		case 3:
			 return "three";
		case 4:
			 return "four";
		case 5:
			 return "five";	
		case 6:
			 return "six";
		case 7:
			 return "seven";
		case 8:
			 return "eight";
		case 9:
			 return "nine";	
		default:
			throw new IndexOutOfBoundsException(String.format("{0} not digit", number));
		}
	}
	
	// number between 10 & 19 
	public static String TeensConvertToText (int number) {
		switch (number) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			throw new IndexOutOfBoundsException(String.format("{0} not teens ", number));
		}
	}
	
	// number between 20 & 99
	public static String BigTensConvertToText(int number) {
		int digitOfTens = (int)Math.floor((double)number/10.0);
		String strOfBigTens = "";
		switch (digitOfTens) {
		case 2:
			strOfBigTens = "twenty"; 
			break;
		case 3:
			strOfBigTens = "thirty"; 
			break;
		case 4:
			strOfBigTens = "forty"; 
			break;
		case 5:
			strOfBigTens = "fifty"; 
			break;
		case 6:
			strOfBigTens = "sixty"; 
			break;
		case 7:
			strOfBigTens = "seventy"; 
			break;
		case 8:
			strOfBigTens = "eighty"; 
			break;
		case 9:
			strOfBigTens = "ninety"; 
			break;
		default:
			throw new IndexOutOfBoundsException(String.format("{0} not in range 20 - 99", number));
		}
		if(number %10 == 0)
		{
			return  strOfBigTens;
		}
		else {
			String strOfDigit = DigitConvertToText(number%10);
			return strOfBigTens + " " + strOfDigit;
		}
	}
	// �� basamakl� ve daha b�y�k say�larda ortak bir yap� kurdum.
	// ilk parametre say�y� al�yor , ikinci parametre hangi basamakta oldu�u , son parameter hangi basamakta i�lem yap�laca��n� tutuyor
	
	public static String BigNumberConvertToString (int number , int baseOfNumber , String baseOfNumStr) {
		
		String specialSeperate = (baseOfNumStr != "hunderd") ? " , ":" ";
		
		int bigPart = (int)Math.floor((double)number/baseOfNumber);
		String bigpartofStr = NumberConvertToString(bigPart)+ " " + baseOfNumStr;
		
		if(number % baseOfNumber == 0) {
			return bigpartofStr;
		}
		else {
			int resultOfNumber = number - (bigPart*baseOfNumber);
			return bigpartofStr+ specialSeperate+ NumberConvertToString(resultOfNumber);
		}
		
	}

}
