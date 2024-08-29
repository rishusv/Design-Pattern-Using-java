package org.designpattern.Adapter.thirdParty;

public class YesBankAPI {
    public double checkBalance(String accNumber){
        return 3000;
    }

    public boolean sendMoney(String fromAcc,String toAcc, double x){
        return true;
    }

}
