package com.company;

class MyBank{
    private static String bankName = "State Bank Of India.";
    private String city;

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    protected static class MyLocker{
        private long lockerId;

        public void setLockerId(long lockerId){
            this.lockerId = lockerId;
        }

        public long getLockerId(){
            return this.lockerId;
        }

        public void show(){
            System.out.println(getLockerId() + " Is one of the lockers of " + bankName);
        }
    }
}

public class StaticInnerClassUnderstanding {

    public static void main(String[] args) {
        MyBank.MyLocker bankLocker = new MyBank.MyLocker();
        bankLocker.setLockerId(18071997L);
        bankLocker.getLockerId();
        bankLocker.show();
    }
}
