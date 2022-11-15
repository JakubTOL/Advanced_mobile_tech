package edu.mobile;

public class Transaction
{
    Contractor contractorA;// seller
    Contractor contractorB;// buyer
    public int orderQuantity;
    public static final int UNCONFIRMED = -1;
    public static final int ON_NEGOTIATION = 0;

    public enum Status
    {
        UNCONFIRMED,
        ON_NEGOTIATION,
        IN_PROGRESS,
        COMPLETED,
    }
    Status status;// -1 - on creation, 0 - negotiation, 1 - in progress, 2 - completed

    //TODO_done1: write constructor with 2 params (contractors)
    public Transaction(Contractor provider, Contractor customer)
    {
        contractorA = provider;
        contractorB = customer;
        if (checkValidity())
        {
            status = Status.ON_NEGOTIATION;
            provider.setInTransaction(true);
            customer.setInTransaction(true);
        }
        else
        {
            status = Status.UNCONFIRMED;
        }
    }

    public Transaction(Contractor provider, Contractor customer, Status status)
    {
        contractorA = provider;
        contractorB = customer;
        provider.setInTransaction(true);
        customer.setInTransaction(true);
        this.status = status;
    }
    private boolean checkValidity()
    {
        return contractorA.getIndustry().equalsIgnoreCase(contractorB.getIndustry());
        /* MY SOLUTION FOR TODO_done1
        //TODO_done1: check if contractor "industry" is the same
        //TODO_done1: check if provider has enough goods to sell
        //if ok: then set status to 0
        if (contractorA.industry.equalsIgnoreCase(contractorB.industry))
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
            return contractorA.industry.equalsIgnoreCase(contractorB.industry);
        }
        else
        {
            System.out.println("Contractors have different industries.");
            return false;
        }
         */
    }
    public void initTransaction()
    {
        //set status to 1 and print to cmd
        status = Status.IN_PROGRESS;
        //System.out.println(status);

    }
    public void completeTransaction()
    {
        // set status to 2 and print to cmd
        status = Status.COMPLETED;
        //System.out.println(status);
    }

    //TODO2: set quantity of goods in transaction
    public void setQuantity(int amount)
    {
        orderQuantity = amount;
    }

    public void superUseful()
    {
        System.out.println("Do nothing.");
    }
}
