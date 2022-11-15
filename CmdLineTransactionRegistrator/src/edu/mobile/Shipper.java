package edu.mobile;

public class Shipper
{
    public void insureTransaction(Transaction t)
    {
        System.out.println("Insuring your transaction.");
    }

    public void makeCustomsClearance(Transaction t)
    {
        System.out.println("Paying customs duty.");
    }
}
