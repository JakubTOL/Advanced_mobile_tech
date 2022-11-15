package edu.mobile.contractors;

import edu.mobile.contractors.IContractor;

public interface ICustomer extends IContractor
{
    void receiveGoods(int amount);

    void distributeToShops();
}
