package edu.mobile;

public class ForeignTransaction extends Transaction
{
    Status status = Status.ON_NEGOTIATION;
    private int amountOfGoods;
    Shipper shipper;

    //TODO2: make this class extended Transaction
    public ForeignTransaction(Contractor provider, Contractor customer, Status status)
    {
        super(provider, customer, status);
    }
    //TODO2: add method to insure transaction
    public void insureTransaction(boolean acceptTransaction)
    {
        if (acceptTransaction == true)
        {
            initTransaction();
            System.out.println("Transaction insured.");
        }
        else
        {
            System.out.println("Can't insure transaction.");
        }
    }

}
