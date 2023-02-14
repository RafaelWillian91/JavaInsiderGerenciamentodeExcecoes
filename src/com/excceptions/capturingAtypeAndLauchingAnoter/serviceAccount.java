package com.excceptions.capturingAtypeAndLauchingAnoter;

import com.excceptions.classExceptions.app.Accounts;
import com.excceptions.classExceptions.InsuficientFundsException;
import com.excceptions.classExceptions.ServiceException;


public class serviceAccount {

    public Accounts createAccount(String account, int amount) throws ServiceException {

        Accounts a1 = new Accounts(account);
        a1.deposit(2000);
        try {
            a1.withdraw(amount);
            return a1;
        } catch (InsuficientFundsException e) {
            throw new ServiceException("Saldo Insuficiente ", e);
        }

    }

}
