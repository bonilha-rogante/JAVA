package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double reais(double dolar, double price) {
        return dolar * price * (1.0 + IOF);
    }
}
