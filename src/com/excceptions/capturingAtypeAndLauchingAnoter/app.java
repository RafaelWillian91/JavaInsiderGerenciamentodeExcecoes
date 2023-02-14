package com.excceptions.capturingAtypeAndLauchingAnoter;

import com.excceptions.classExceptions.app.Accounts;
import com.excceptions.classExceptions.ServiceException;

public class app {

    public static void main(String[] args) {

        serviceAccount s1 = new serviceAccount();
        try {
            Accounts a2 = s1.createAccount("1234", 3000);
            System.out.println(a2.toString());
        } catch (ServiceException e) {
            e.printStackTrace();
        }


    }

}
