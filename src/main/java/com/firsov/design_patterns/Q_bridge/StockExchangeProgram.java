package com.firsov.design_patterns.Q_bridge;

public class StockExchangeProgram extends Program{

    protected StockExchangeProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
