package edu.mobile;

public interface IProvider
{
    String getName();

    int getId();

    String getIndustry();

    int getInStoreAmount();

    void dispatch();

    void makeOffer();

    void dispatchGoods(int amount);

    boolean hasEnoughGoods(int amount);
}
