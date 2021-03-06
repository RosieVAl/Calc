package Calculator.insuranse;


import junit.framework.TestCase;


/**
 * Тестовый класс для класса {@link Calculation}
 * @author DK
 * @version 2.1
 */

public class CalcExpRateTest extends TestCase{
	/**
	 * Тестовый метод, проверяющий правильность присваивания коэффициента стаж/возраст {@link ic.Calculation#testExpRate}
	 * @param ExpRate коэффициент стаж/возраст
	 */
	public void testExpRate() {
		Calculator calc = new Calculator(); 
		String ExpRate = Double.toString(calc.calcExpRate(0,0));
		assertEquals("1.87", ExpRate);
		assertFalse("1.66".equals(ExpRate));
		assertFalse("1.63".equals(ExpRate));
		assertFalse("0.93".equals(ExpRate));
		}
	}