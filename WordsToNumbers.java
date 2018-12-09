package numberToConvertText;

import java.util.Arrays;
import java.util.List;

public class WordsToNumbers {
 	// global variables
	boolean isValidWords = true;
 	long result = 0;
    long finalResult = 0;
    //Kullancaðýmýz vektör uzayýmýz
	List<String> wordsNumber = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred",
			"thousand", "million", "billion", "trillion");

	public  long WordsConvertNUmbers(String words) {
		finalResult=0;
		if(words !=null && words.length()>0) {
			
			// 
			words =wordsReplace(words);
			
			// kelimeyi parçalamak için regular expresiondan yaralandým
			String[] splitter =wordsRegex(words); 
			
			// chechk of words (valid or invalid)
			isValidWords=chechkedWords(splitter);
			
			if(isValidWords)
	        {	
				//Convert words to number Functions
				finalResult= wordsConvertToNUmber(splitter);
	           
	        }
	        finalResult += result;
	        result=0; 
		}
		return  finalResult;
	}

	private String[] wordsRegex(String words) {
		String [] temp_words = null;
		// \\s+ bir ya da birden fazla boþluklara göre böler. . .
		temp_words=words.trim().split("\\s+");
		return temp_words;
	}

	private long wordsConvertToNUmber(String[] splitter) {
		// tüm diziyi iteratif bir þekilde dönerek her bir words için long sayýya ekleme yapar . . .
		 for(String str : splitter)
         {
             if(str.equalsIgnoreCase("zero")) {
                 result += 0;
             }
             else if(str.equalsIgnoreCase("one")) {
                 result += 1;
             }
             else if(str.equalsIgnoreCase("two")) {
                 result += 2;
             }
             else if(str.equalsIgnoreCase("three")) {
                 result += 3;
             }
             else if(str.equalsIgnoreCase("four")) {
                 result += 4;
             }
             else if(str.equalsIgnoreCase("five")) {
                 result += 5;
             }
             else if(str.equalsIgnoreCase("six")) {
                 result += 6;
             }
             else if(str.equalsIgnoreCase("seven")) {
                 result += 7;
             }
             else if(str.equalsIgnoreCase("eight")) {
                 result += 8;
             }
             else if(str.equalsIgnoreCase("nine")) {
                 result += 9;
             }
             else if(str.equalsIgnoreCase("ten")) {
                 result += 10;
             }
             else if(str.equalsIgnoreCase("eleven")) {
                 result += 11;
             }
             else if(str.equalsIgnoreCase("twelve")) {
                 result += 12;
             }
             else if(str.equalsIgnoreCase("thirteen")) {
                 result += 13;
             }
             else if(str.equalsIgnoreCase("fourteen")) {
                 result += 14;
             }
             else if(str.equalsIgnoreCase("fifteen")) {
                 result += 15;
             }
             else if(str.equalsIgnoreCase("sixteen")) {
                 result += 16;
             }
             else if(str.equalsIgnoreCase("seventeen")) {
                 result += 17;
             }
             else if(str.equalsIgnoreCase("eighteen")) {
                 result += 18;
             }
             else if(str.equalsIgnoreCase("nineteen")) {
                 result += 19;
             }
             else if(str.equalsIgnoreCase("twenty")) {
                 result += 20;
             }
             else if(str.equalsIgnoreCase("thirty")) {
                 result += 30;
             }
             else if(str.equalsIgnoreCase("forty")) {
                 result += 40;
             }
             else if(str.equalsIgnoreCase("fifty")) {
                 result += 50;
             }
             else if(str.equalsIgnoreCase("sixty")) {
                 result += 60;
             }
             else if(str.equalsIgnoreCase("seventy")) {
                 result += 70;
             }
             else if(str.equalsIgnoreCase("eighty")) {
                 result += 80;
             }
             else if(str.equalsIgnoreCase("ninety")) {
                 result += 90;
             }
             else if(str.equalsIgnoreCase("hundred")) {
                 result *= 100;
             }
             else if(str.equalsIgnoreCase("thousand")) {
                 result *= 1000;
                 finalResult += result;
                 result=0;
             }
             else if(str.equalsIgnoreCase("million")) {
                 result *= 1000000;
                 finalResult += result;
                 result=0;
             }
             else if(str.equalsIgnoreCase("billion")) {
                 result *= 1000000000;
                 finalResult += result;
                 result=0;
             }
             else if(str.equalsIgnoreCase("trillion")) {
                 result *= 1000000000000L;
                 finalResult += result;
                 result=0;
             }
         }
		return finalResult;
	}

	private boolean chechkedWords(String[] splitter) {
		for(String str : splitter)
        {
			// örnek uzayýmýzda olmayan bir kelime gelirse
            if(!wordsNumber.contains(str))
            {
            	// kelimeyi invalid olarak atýyoruz
                isValidWords = false;
                break;
            }
        }
		// kelime bilgisini üst metoda dönüyoruz . .
		if(isValidWords == true) {
			return true;
		}else {
			return false;
		}
			
	
	}

	private String wordsReplace(String words) {
		// gelen word içindeki gürültüleri temizliyoruz . . .
		String temp_words ="";
		words = words.replaceAll("-", " ");
		words = words.toLowerCase().replaceAll(" and", " ");
		temp_words = words;
		return temp_words;
	}	
	
}
