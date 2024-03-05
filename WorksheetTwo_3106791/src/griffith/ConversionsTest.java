package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversionsTest {
	

	@Test
	void celsiusToFahrenheitTest() {
		 Conversions conversions = new Conversions();

		 assertEquals(50,conversions.celsiusToFahrenheit(10));
		 assertEquals(59,conversions.celsiusToFahrenheit(15));
		 assertEquals(41,conversions.celsiusToFahrenheit(5));	 
	}
	@Test
	void fahrenheitToCelsiusTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(25,conversions.fahrenheitToCelsius(77));
		 assertEquals(5,conversions.fahrenheitToCelsius(41));
		 assertEquals(20,conversions.fahrenheitToCelsius(68));

	}
	@Test
	void milesToKilometerTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(1.6,conversions.milesToKilometer(1));
		 assertEquals(8,conversions.milesToKilometer(5));
		 assertEquals(32,conversions.milesToKilometer(20));
	}
	@Test
	void kilometerToMilesTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(30,conversions.kilometerToMiles(48));
		 assertEquals(10,conversions.kilometerToMiles(16));
		 assertEquals(20,conversions.kilometerToMiles(32));

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
		 assertEquals("STRING",conversions.lowerCaseToUpperCase("StrInG"));
		 assertEquals("HELLO",conversions.lowerCaseToUpperCase("HellO"));
		 assertEquals("CONVERT",conversions.lowerCaseToUpperCase("ConVerT"));
	}
}
