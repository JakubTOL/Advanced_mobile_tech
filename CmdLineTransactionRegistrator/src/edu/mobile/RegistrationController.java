package edu.mobile;

import edu.mobile.contractors.*;
import edu.mobile.transactions.Deal;

public class RegistrationController
{
    public static void main(String[] args)
    {
        Provider provider = new Provider("Microsoft","Software");
        //System.out.println("Seller id is: " + provider.getContractorId());

        Customer customer = new Customer("Apple","Computers");
        //System.out.println("Buyer id is: " + customer.getContractorId());

        customer.makeOffer();

        provider.makeOffer(5);

        Transaction t = new Transaction(provider, customer, Transaction.Status.ON_NEGOTIATION);

        provider.setName("New Microsoft");

        ICustomer newCustomer = new EndCustomer();
        ICustomer newBroker = new Broker();
        IProvider newProvider = new Vendor();
        Deal newDeal = new Deal(10,newBroker,newProvider);
        IProvider newBroker2 = (IProvider) newBroker;
        Deal newDeal2 = new Deal(10,newCustomer,newBroker2);

    }
}

