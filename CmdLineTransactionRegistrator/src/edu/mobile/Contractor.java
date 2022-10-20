package edu.mobile;

public class Contractor
{
    String name;
    static int id = 0;
    String industry;
    int contractorType; //0-buyer, 1-provider
    int contractorId;
    int inStoreAmount;

    public Contractor(String name, String industry, int contractorType)
    {
        this.name = name;
        this.industry = industry;
        this.contractorType = contractorType;
        contractorId= id++;
    }
    //declaration of method to subtract goods from provider stock
    public void provideGoods(int amount)
    {
        inStoreAmount -= amount;
    }
    //declaration of method to add goods to buyer stock
    public void receiveGoods(int amount)
    {
        inStoreAmount += amount;
    }
}
