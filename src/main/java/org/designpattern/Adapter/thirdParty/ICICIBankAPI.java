package org.designpattern.Adapter.thirdParty;

public class ICICIBankAPI {
    public double checkBalance(String accNumber){
        return 2000;
    }

    public boolean sendMoney(String fromAcc,String toAcc, double x){
        return true;
    }
}
