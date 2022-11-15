package edu.mobile.transactions;

import edu.mobile.contractors.ICustomer;
import edu.mobile.contractors.IProvider;

public class Deal
{
    private ICustomer customer;
    private IProvider provider;
    private int amountOfGoods;

    public Deal(int qty, ICustomer customer, IProvider provider)
    {
        amountOfGoods = qty;
        this.customer = customer;
        this.provider = provider;
    }
}
