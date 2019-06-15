import org.junit.Test;

import codingtest.NumberToString;
import junit.framework.Assert;

public class TestNumberToString {
	NumberToString obj = new NumberToString();
	
	
	@Test
	public void testNineDigit() {
		int number = 56945781;
		Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", obj.convertToWord(number));
	}
	
	@Test
	public void testSingleDigit() {
		int number = 5;
		Assert.assertEquals("five", obj.convertToWord(number));
	}
	
	@Test
	public void testTwoDigit() {
		int number = 46;
		Assert.assertEquals("forty six", obj.convertToWord(number));
	}
	
	@Test
	public void testThreeDigit() {
		int number = 468;
		Assert.assertEquals("four hundred and sixty eight", obj.convertToWord(number));
	}
	
	@Test
	public void testFourDigit() {
		int number = 5468;
		Assert.assertEquals("five thousand four hundred and sixty eight", obj.convertToWord(number));
	}
	
	@Test
	public void testFiveDigit() {
		int number = 45468;
		Assert.assertEquals("forty five thousand four hundred and sixty eight", obj.convertToWord(number));
	}
	
	@Test
	public void testSixDigit() {
		int number = 145468;
		Assert.assertEquals("one hundred and forty five thousand four hundred and sixty eight", obj.convertToWord(number));
	}
	
	@Test
	public void testSevenDigit() {
		int number = 8145468;
		Assert.assertEquals("eight million one hundred and forty five thousand four hundred and sixty eight", obj.convertToWord(number));
	}
	
	@Test
	public void testEightDigit() {
		int number = 81475468;
		Assert.assertEquals("eighty one million four hundred and seventy five thousand four hundred and sixty eight", obj.convertToWord(number));
	}
	
	

}
