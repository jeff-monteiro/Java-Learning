package src.start.labs.dollarQuote.utilities;

public class CurrencyConverter {

    public static double IOF = 1.0 + 0.06;

    public static double dollarToReal(double toBeBought, double dollarValue){
        double value = toBeBought * dollarValue * IOF;
        return value;
    }
}
