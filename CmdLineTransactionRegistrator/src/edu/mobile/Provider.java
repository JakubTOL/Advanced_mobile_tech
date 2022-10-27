package edu.mobile;

public class Provider extends Contractor
{
    public Provider(String name, String industry)
    {
        super(name, industry, ContractorType.PROVIDER);
    }

    //declaration of method to subtract goods from provider stock
    public void provideGoods(int amount) {setInStoreAmount(getInStoreAmount() - amount);}

    public void makeOffer()
    {
        System.out.println(("I want to sell goods."));
    }
}
