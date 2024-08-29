package org.designpattern.Adapter;

import org.designpattern.Adapter.thirdParty.HDFCBankAPI;

public class HDFCBankAPIAdapter implements BankAPI{
    HDFCBankAPI hdfcBankAPI = new HDFCBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return hdfcBankAPI.checkBalance(accountNumber);
    }
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return hdfcBankAPI.sendMoney(fromAccount,toAccount,amount);
    }
}
