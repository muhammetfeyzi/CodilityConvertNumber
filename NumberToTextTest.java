package numberToConvertTextTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import numberToConvertText.NumberToText;

public class NumberToTextTest {
	// testNumber Deðiþkenini initialize ettim. Stackte yer ayrýldý.
	NumberToText testNumber ; 
	@Before
	public void setUp() throws Exception {
		// Heap bölgesinde referans edecek olduðu alaný belirttim.
		testNumber = new NumberToText();
	}

	@Test
	public void testIntegerToWordParser() {
		// ana fonksiyon üzerinden test case oluþturdum . . 
		assertEquals(testNumber.integerToWordParser(2), "two");
		assertEquals(testNumber.integerToWordParser(7), "seven");
		assertEquals(testNumber.integerToWordParser(5), "five");
		assertEquals(testNumber.integerToWordParser(12), "twelve");
		assertEquals(testNumber.integerToWordParser(17), "seventeen");
		assertEquals(testNumber.integerToWordParser(19), "nineteen");
		assertEquals(testNumber.integerToWordParser(20), "twenty");
		assertEquals(testNumber.integerToWordParser(90), "ninety");
		assertEquals(testNumber.integerToWordParser(70), "seventy");
		assertEquals(testNumber.integerToWordParser(28), "twenty eight");
		assertEquals(testNumber.integerToWordParser(52), "fifty two");
		assertEquals(testNumber.integerToWordParser(61), "sixty one");
		assertEquals(testNumber.integerToWordParser(45), "forty five");
		assertEquals(testNumber.integerToWordParser(200), "two hundred");
		assertEquals(testNumber.integerToWordParser(500), "five hundred");
		assertEquals(testNumber.integerToWordParser(700), "seven hundred");
		assertEquals(testNumber.integerToWordParser(745), "seven hundred and forty five");
		assertEquals(testNumber.integerToWordParser(132), "one hundred and thirty two");
		assertEquals(testNumber.integerToWordParser(5000), "five thousand");
		assertEquals(testNumber.integerToWordParser(2000), "two thousand");
		assertEquals(testNumber.integerToWordParser(5671), "five thousand and six hundred and seventy one");

	}

}
