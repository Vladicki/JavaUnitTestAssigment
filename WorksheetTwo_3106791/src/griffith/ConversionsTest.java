package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversionsTest {
	

	@Test
	void celsiusToFahrenheitTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(25,conversions.celsiusToFahrenheit(77));
		 assertEquals(5,conversions.celsiusToFahrenheit(41));
		 assertEquals(20,conversions.celsiusToFahrenheit(68));
		 
	}
	@Test
	void fahrenheitToCelsiusTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(50,conversions.fahrenheitToCelsius(10));
		 assertEquals(59,conversions.fahrenheitToCelsius(15));
		 assertEquals(41,conversions.fahrenheitToCelsius(5));

	}
	@Test
	void milesToKilometerTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(30,conversions.milesToKilometer(48));
		 assertEquals(10,conversions.milesToKilometer(16));
		 assertEquals(20,conversions.milesToKilometer(32));

	}
	@Test
	void kilometerToMilesTest() {
		 Conversions conversions = new Conversions();
		 assertEquals(1.6,conversions.kilometerToMiles(1));
		 assertEquals(8,conversions.kilometerToMiles(5));
		 assertEquals(32,conversions.kilometerToMiles(20));

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
