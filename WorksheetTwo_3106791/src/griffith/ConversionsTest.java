package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversionsTest {
	

	@Test
	void celsiusToFahrenheitTest() {
		 Conversions conversions = new Conversions();

	}
	@Test
	void fahrenheitToCelsiusTest() {
		 Conversions conversions = new Conversions();

	}
	@Test
	void milesToKilometerTest() {
		 Conversions conversions = new Conversions();

	}
	@Test
	void kilometerToMilesTest() {
		 Conversions conversions = new Conversions();

	}
	@Test
	void upperCaseToLowerCaseTest() {
		 Conversions conversions = new Conversions();
		 assertEquals("string",conversions.upperCaseToLowerCase("StrInG"));
		 assertEquals("hello",conversions.upperCaseToLowerCase("HellO"));
		 assertEquals("convert",conversions.upperCaseToLowerCase("ConVerT"));

	}
	@Test
	void lowerCaseToUpperCaseTest() {
		 Conversions conversions = new Conversions();
		 assertEquals("STRING",conversions.upperCaseToLowerCase("StrInG"));
		 assertEquals("HELLO",conversions.upperCaseToLowerCase("HellO"));
		 assertEquals("CONVERT",conversions.upperCaseToLowerCase("ConVerT"));
	}
}
