package numberToConvertTextTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import numberToConvertText.BigNumberConvertToText;

public class BigNumberConvertToTextTest {
	
	//Junit için oluþturduðum bu test case aþamasýnda
	// sayýnýn her bir basamaðýnýn dönüldüðü fonksiyonlarýn 
	// test driven yakalaþýmýyla gerçekleþtirdim. . .
	
	
	// ilk olarak data initilaze ediliyor.
	// Bellekte bir yer kaplýyor fakat henüz referans edeceði heap bölgesi belli deðil
	BigNumberConvertToText convertNumber;
	
	@Before
	public void setUp() throws Exception {
		// Test ilk çalýþma zamanýnda nesnenin 
		//instance üretilecektir.
		convertNumber = new BigNumberConvertToText(); 
		// Artýk bellekte referans edeceði bölge atanmýþtýr.
	}

	@Test
	public void testDigitConvertToText() {
		// 0 & 9 
		assertEquals(convertNumber.DigitConvertToText(2), "two");
		assertEquals(convertNumber.DigitConvertToText(5), "five");
		assertEquals(convertNumber.DigitConvertToText(9), "nine");
		
	}

	@Test
	public void testTeensConvertToText() {
		//10 & 19 
		assertEquals(convertNumber.TeensConvertToText(15), "fifteen");
		assertEquals(convertNumber.TeensConvertToText(12), "twelve");
		assertEquals(convertNumber.TeensConvertToText(18), "eighteen");
	}

	@Test
	public void testBigTensConvertToText() {
		// 20 & 99
		assertEquals(convertNumber.BigTensConvertToText(50), "fifty");
		assertEquals(convertNumber.BigTensConvertToText(75), "seventy five");
		assertEquals(convertNumber.BigTensConvertToText(61), "sixty one");
		assertEquals(convertNumber.BigTensConvertToText(28), "twenty eight");
		assertEquals(convertNumber.BigTensConvertToText(34), "thirty four");
		assertEquals(convertNumber.BigTensConvertToText(99), "ninety nine");
		assertEquals(convertNumber.BigTensConvertToText(81), "eighty one");
	}

	@Test
	public void testBigNumberConvertToString() {
	    // 100 -  	
		assertEquals(convertNumber.BigNumberConvertToString(100, 100, "hundred"), "one hundred");
		assertEquals(convertNumber.BigNumberConvertToString(1000, 1000, "thousand"), "one thousand");
		assertEquals(convertNumber.BigNumberConvertToString(1000000, 1000000, "million"), "one million");
		assertEquals(convertNumber.BigNumberConvertToString(1000000000, 1000000000, "billion"), "one billion");
		assertEquals(convertNumber.BigNumberConvertToString(661, 100, "hundred"), "six hundred , sixty one");
		assertEquals(convertNumber.BigNumberConvertToString(1228, 1000, "thousand"), "one thousand , two hundred , twenty eight");
		assertEquals(convertNumber.BigNumberConvertToString(1765568, 1000000, "million"), "one million , seven hundred , sixty five thousand , five hundred , sixty eight");
	}

	@Test
	public void testNumberConvertToString() {
		// business fonksiyonumuzu test driven metodolojisi ile roluþturalým.
		
		assertEquals(convertNumber.NumberConvertToString(1),"one");
		assertEquals(convertNumber.NumberConvertToString(4),"four");
		assertEquals(convertNumber.NumberConvertToString(8),"eight");
		assertEquals(convertNumber.NumberConvertToString(7),"seven");
		
		assertEquals(convertNumber.NumberConvertToString(11),"eleven");
		assertEquals(convertNumber.NumberConvertToString(13),"thirteen");
		assertEquals(convertNumber.NumberConvertToString(14),"fourteen");
		assertEquals(convertNumber.NumberConvertToString(18),"eighteen");
		assertEquals(convertNumber.NumberConvertToString(17),"seventeen");
		
		assertEquals(convertNumber.NumberConvertToString(35),"thirty five");
		assertEquals(convertNumber.NumberConvertToString(61),"sixty one");
		assertEquals(convertNumber.NumberConvertToString(28),"twenty eight");
		assertEquals(convertNumber.NumberConvertToString(52),"fifty two");
		assertEquals(convertNumber.NumberConvertToString(74),"seventy four");
		assertEquals(convertNumber.NumberConvertToString(99),"ninety nine");
		assertEquals(convertNumber.NumberConvertToString(83),"eighty three");
		assertEquals(convertNumber.NumberConvertToString(41),"forty one");
		
		assertEquals(convertNumber.NumberConvertToString(110),"one hundred , ten");
		assertEquals(convertNumber.NumberConvertToString(1010),"one thousand , ten");
		assertEquals(convertNumber.NumberConvertToString(10010),"ten thousand , ten");
		assertEquals(convertNumber.NumberConvertToString(100010),"one hundred thousand , ten");
		assertEquals(convertNumber.NumberConvertToString(1000010),"one million , ten");
		assertEquals(convertNumber.NumberConvertToString(999),"nine hundred , ninety nine");
		assertEquals(convertNumber.NumberConvertToString(561),"five hundred , sixty one");
		assertEquals(convertNumber.NumberConvertToString(9999),"nine thousand , nine hundred , ninety nine");
		assertEquals(convertNumber.NumberConvertToString(125678),"one hundred , twenty five thousand , six hundred , seventy eight");
		assertEquals(convertNumber.NumberConvertToString(850),"eight hundred , fifty");
		
		assertEquals(convertNumber.NumberConvertToString(2147483646),"two billion , one hundred , forty seven million , four hundred , eighty three thousand , six hundred , forty six");
		assertEquals(convertNumber.NumberConvertToString(-1),"neagtive numbers not supported");
		
		
		
		
		
	}

}
