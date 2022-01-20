package com.company;

public class DaysOfWeekImplementor {
    public static void main(String[] args) {
        DaysOfWeek day_one = DaysOfWeek.SUNDAY;
        if(day_one == DaysOfWeek.SUNDAY){
            System.out.println("It is weekend. Yeyy...");
        }

        for(DaysOfWeek myDay: DaysOfWeek.values()){
            System.out.println("It's " + myDay + " today.");
        }
    }
}
