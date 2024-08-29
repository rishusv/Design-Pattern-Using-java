package org.designpattern.Adapter;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }
    public PhonePe(){}
    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("1111");
        return currentBalance*2;
    }
    public void showBalance(){
        // print balance
    }
}
