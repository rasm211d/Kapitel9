package Opg9_2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        System.out.println("symbol: " + symbol + " and name: " + name);

    }
    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        double changePercent = (previousClosingPrice - currentPrice) / previousClosingPrice;
        System.out.println(changePercent);
        return changePercent;
    }
}
