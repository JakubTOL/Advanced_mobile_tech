package edu.mobile;

public class RegistrationController
{
    public static void main(String[] args)
    {
        /*
        //quick reminder form MS_Teams classes
        //System.out.println("Hello world!");
        int a = 10;
        long b = 1_000_000;
        float c = 1.1234f;
        double d = 1.4;
        boolean e = true, f = false;
        char g = 'a';
        String h = "my_text"; //string is an object and can't be modified
        // h = "new_text" //will be another object, previous string 'h' won't be destroyed
        Object i = new String("Some other new string"); //create new object in stack
        String i_str = (String) i; //conversion from object to string

        Object o = new String();

        for (int k=0;k<2;k++)
        {
            System.out.println("Argument " + k + "=" + args[k]);
        }

         */
        Contractor seller = new Contractor("Microsoft","Software",1);
        System.out.println("Seller id is: " + seller.contractorId);

        Contractor buyer = new Contractor("Apple","Computers",0);
        System.out.println("Buyer id is: " + buyer.contractorId);
    }

    /*
    //public method with no return
    public static void helperRegistration()
    {
        //code should be putted here
    }
    */
}

