package org.designpattern.Adapter;

import org.designpattern.Adapter.thirdParty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{

    YesBankAPI yesBankAPI= new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return yesBankAPI.sendMoney(fromAccount,toAccount,amount);
    }
}
