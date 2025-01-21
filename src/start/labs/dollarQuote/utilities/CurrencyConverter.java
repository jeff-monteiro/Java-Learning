package src.start.labs.dollarQuote.utilities;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double toBeBought, double dollarValue){
        double value = toBeBought * dollarValue;
        return   value + (value * IOF);

    }
}
