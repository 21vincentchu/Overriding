package com.company;

public class Commission extends Hourly
{
    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }

    public void addSales(double sales)
    {
        totalSales += sales;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\n total sales:" + totalSales;

        return result;

    }

    public double pay()
    {
        double commission = (commissionRate / 100) * totalSales;
        double payment = super.pay() + commission;
        totalSales = 0;

        return payment;
    }
}
