package edu.mobile.contractors;

import edu.mobile.contractors.IContractor;

public interface IProvider extends IContractor
{
    void dispatchGoods(int amount);

    boolean hasEnoughGoods(int amount);
}
