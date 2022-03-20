package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double exchange(double dollarPrice, double quantityDollars) {
		return dollarPrice * quantityDollars * (1.0 + IOF);
	}
}
