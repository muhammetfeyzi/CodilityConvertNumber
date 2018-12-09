package numberToConvertTextTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import numberToConvertText.WordsToNumbers;

public class WordsToNumbersTest {
	WordsToNumbers convertWords;

	@Before
	public void setUp() throws Exception {
		convertWords = new WordsToNumbers();
	}

	@Test
	public void testWordsConvertNUmbers() {
		// one - two ... nine
		assertEquals(2,convertWords.WordsConvertNUmbers("two"));
		assertEquals(5,convertWords.WordsConvertNUmbers("five"));
		assertEquals(7,convertWords.WordsConvertNUmbers("seven"));
		
		// eleven , twelve , ...... nineteen
		assertEquals(13,convertWords.WordsConvertNUmbers("thirteen"));
		assertEquals(15,convertWords.WordsConvertNUmbers("fifteen"));
		assertEquals(19,convertWords.WordsConvertNUmbers("nineteen"));
		assertEquals(14,convertWords.WordsConvertNUmbers("fourteen"));
		
		// twenty, twenty one , thirty two , ...... ninety nine
		assertEquals(35,convertWords.WordsConvertNUmbers("thirty five"));
		assertEquals(52,convertWords.WordsConvertNUmbers("fifty two"));
		assertEquals(61,convertWords.WordsConvertNUmbers("sixty one"));
		assertEquals(78,convertWords.WordsConvertNUmbers("seventy eight"));
		assertEquals(99,convertWords.WordsConvertNUmbers("ninety nine"));
		assertEquals(41,convertWords.WordsConvertNUmbers("forty one"));
		assertEquals(28,convertWords.WordsConvertNUmbers("twenty eight"));
		
		// a hundred, a hundred ten ........ nine hundred and ninety nine
		assertEquals(200,convertWords.WordsConvertNUmbers("two hundred"));
		assertEquals(161,convertWords.WordsConvertNUmbers("one hundred and sixty one"));
		assertEquals(228,convertWords.WordsConvertNUmbers("two hundred and twenty eight"));
		assertEquals(333,convertWords.WordsConvertNUmbers("three hundred and thirty three"));
		assertEquals(491,convertWords.WordsConvertNUmbers("four hundred and ninety one"));
		assertEquals(444,convertWords.WordsConvertNUmbers("four hundred and forty four"));
		assertEquals(661,convertWords.WordsConvertNUmbers("six hundred and sixty one"));
		assertEquals(775,convertWords.WordsConvertNUmbers("seven hundred and seventy five"));
		assertEquals(999,convertWords.WordsConvertNUmbers("nine hundred and ninety nine"));
		
		// words mapping with big numbers
		assertEquals(307061,convertWords.WordsConvertNUmbers("Three hundred seven thousand and sixty one"));
		assertEquals(102034,convertWords.WordsConvertNUmbers("One hundred two thousand and thirty four"));
		assertEquals(10000,convertWords.WordsConvertNUmbers("ten thousand"));
		assertEquals(1000000,convertWords.WordsConvertNUmbers("One million"));
		assertEquals(1000000000,convertWords.WordsConvertNUmbers("One billion"));
		
	}

}
