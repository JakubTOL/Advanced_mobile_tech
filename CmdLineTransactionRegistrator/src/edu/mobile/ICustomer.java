package edu.mobile;

public interface ICustomer
{
    String getName();

    int getId();

    String getIndustry();

    int getInStoreAmount();

    void dispatch();

    void makeOffer();

    void receiveGoods(int amount);
}
