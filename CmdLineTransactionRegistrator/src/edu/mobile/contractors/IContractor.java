package edu.mobile.contractors;

public interface IContractor
{
    String getName();

    int getId();

    String getIndustry();

    int getInStoreAmount();

    void dispatch();

    void makeOffer();
}
