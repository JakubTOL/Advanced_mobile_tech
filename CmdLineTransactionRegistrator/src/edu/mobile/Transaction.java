package edu.mobile;

public class Transaction
{
    Contractor contractorA;// seller
    Contractor contractorB;// buyer
    String status;// -1 - on creation, 0 - negotiation, 1 - in progress, 2 - completed
    long order_quantity;

    //TODO: write constructor with 2 params (contractors)
    public Transaction(Contractor seller, Contractor buyer)
    {
        this.contractorA = seller;
        this.contractorB = buyer;
    }
    public void checkValidity()
    {
        //TODO: check if contractor "industry" is the same
        //TODO: check if provider has enough goods to sell
        //if ok: then set status to 0
        if (contractorA.industry == contractorB.industry)
        {
            if (order_quantity < contractorA.inStoreAmount)
            {
                status = "Negotiation";
                System.out.println("Current status is: " + status);
            }
            else
            {
                System.out.println("There is not enough goods to complete transaction.");
            }
        }
        else
        {
            System.out.println("Contractors have different industries.");
        }
    }
    public void initTransaction()
    {
        //set status to 1 and print to cmd
        status = "In progress";
        System.out.println(status);
    }
    public void completeTransaction()
    {
        // set status to 2 and print to cmd
        status = "Completed";
        System.out.println(status);
    }
}
