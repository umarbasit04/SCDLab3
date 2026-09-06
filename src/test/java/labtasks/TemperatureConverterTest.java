package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit_Zero() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit_Hundred() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius_Zero() {
        assertEquals(-17.78, converter.fahrenheitToCelsius(0), 0.01);
    }

    @Test
    public void testCelsiusToKelvin_Zero() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
    }

    @Test
    public void testRoundTrip_CelsiusToFahrenheitToCelsius() {
        double original = 37.0;
        double converted = converter.fahrenheitToCelsius(converter.celsiusToFahrenheit(original));
        assertEquals(original, converted, 0.01);
    }
}
