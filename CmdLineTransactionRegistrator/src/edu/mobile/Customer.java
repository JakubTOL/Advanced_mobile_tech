package edu.mobile;

public class Customer extends Contractor
{
    public Customer(String name, String industry)
    {
        super(name, industry, ContractorType.CUSTOMER);
    }

    //declaration of method to add goods to buyer stock
    public void receiveGoods(int amount)
    {
        setInStoreAmount(getInStoreAmount() + amount);
    }

    public void makeOffer()
    {
 //       super.makeOffer();
        System.out.println("I want to buy goods.");
    }
}
