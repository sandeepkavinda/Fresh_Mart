package model;

public class ChartlData {


    private String month;
    private Double sellings;
    private Double expence;
    private Double profit;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getSellings() {
        return sellings;
    }

    public void setSellings(Double sellings) {
        this.sellings = sellings;
    }

    public Double getExpence() {
        return expence;
    }

    public void setExpence(Double expence) {
        this.expence = expence;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public ChartlData(String month, Double sellings, Double expence, Double profit) {
        this.month = month;
        this.sellings = sellings;
        this.expence = expence;
        this.profit = profit;
    }
    
}
