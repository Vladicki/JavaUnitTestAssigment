package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversionsTest {
	

	@Test
	void celsiusToFahrenheitTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(25,conversions.celsiusToFahrenheit(10));
		 assertEquals(5,conversions.celsiusToFahrenheit(15));
		 assertEquals(20,conversions.celsiusToFahrenheit(50));
		 
	}
	@Test
	void fahrenheitToCelsiusTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(10,conversions.fahrenheitToCelsius(25));
		 assertEquals(15,conversions.fahrenheitToCelsius(5));
		 assertEquals(20,conversions.fahrenheitToCelsius(7));

	}
	@Test
	void milesToKilometerTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(30,conversions.milesToKilometer(49));
		 assertEquals(10,conversions.milesToKilometer(17));
		 assertEquals(6,conversions.milesToKilometer(10));

	}
	@Test
	void kilometerToMilesTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(49,conversions.kilometerToMiles(30));
		 assertEquals(10,conversions.kilometerToMiles(17));
		 assertEquals(10,conversions.kilometerToMiles(6));

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
