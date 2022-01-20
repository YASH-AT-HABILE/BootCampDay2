package com.company;

class Bank{
    private String bankName;

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }
    class Locker {
        private long lockerId;

        public void setLockerId(long lockerId){
            this.lockerId = lockerId;
        }

        public long getLockerId(){
            return this.lockerId;
        }

        public void show(){
            System.out.println(getLockerId() + " Is one of the lockers of " + getBankName());
        }
    }
}

public class InnerClassUnderstanding {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank.Locker locker1 = bank1.new Locker();

        bank1.setBankName("Maharashtra Bank");
        bank1.getBankName();

        locker1.setLockerId(18071997L);
        locker1.getLockerId();
        locker1.show();

    }

}
