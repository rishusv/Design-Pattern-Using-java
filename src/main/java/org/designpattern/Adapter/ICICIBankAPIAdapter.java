package org.designpattern.Adapter;

import org.designpattern.Adapter.BankAPI;
import org.designpattern.Adapter.thirdParty.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI {

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return iciciBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return iciciBankAPI.sendMoney(fromAccount,toAccount,amount);
    }
}
