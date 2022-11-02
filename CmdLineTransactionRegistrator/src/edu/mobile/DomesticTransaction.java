package edu.mobile;

public class DomesticTransaction extends Transaction
{
    //TODO2: make this class extend Transaction
    public DomesticTransaction(Contractor provider, Contractor customer, Status status)
    {
        super(provider, customer, status);
    }
    //TODO2: add method which checks if customer accepts lower delivery
    public boolean acceptTransaction()
    {
        if (contractorA.getInStoreAmount() >= orderQuantity)
        {
            System.out.println("We can make a deal!");
            return true;
        }
        else
        {
            System.out.println("Not enough good to complete transaction");
            return false;
        }
    }
}
