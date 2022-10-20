package edu.mobile;

public class Transaction
{
    Contractor contractorA;
    Contractor contractorB;
    String status;// -1 - on creation, 0 - negotiation, 1 - in progress, 2 - completed

    //TODO: write constructor with 2 params (contractors)
    public Transaction()
    {

    }
    public void checkValidity()
    {
        //TODO: check if contractor "industry" is the same
        //TODO: check if provider has enough goods to sell
        //if ok: then set status to 0
    }
    public void initTransaction()
    {
        //set status to 1 and print to cmd
    }
    public void completeTransaction()
    {
        // set status to 0 and print to cmd
    }
}
