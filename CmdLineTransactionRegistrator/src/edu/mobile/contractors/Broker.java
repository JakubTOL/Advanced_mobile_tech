package edu.mobile.contractors;

public class Broker implements ICustomer,IProvider
{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getIndustry() {
        return null;
    }

    @Override
    public int getInStoreAmount() {
        return 0;
    }

    @Override
    public void dispatch() {

    }

    @Override
    public void makeOffer() {

    }

    @Override
    public void receiveGoods(int amount) {

    }

    @Override
    public void distributeToShops() {

    }

    @Override
    public void dispatchGoods(int amount) {

    }

    @Override
    public boolean hasEnoughGoods(int amount) {
        return false;
    }
}
