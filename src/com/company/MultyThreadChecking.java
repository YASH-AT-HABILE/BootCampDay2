package com.company;

class MyThreadOne extends Thread{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Thread One is running. ");
            executionCounter++;
        }
    }
}

class MyThreadTwo extends Thread{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Thread Two is running. ");
            executionCounter++;
        }
    }
}

class MyThreadThree extends Thread{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Thread Three is running. ");
            executionCounter++;
        }
    }
}

public class MultyThreadChecking {
    public static void main(String[] args) {
        MyThreadOne threadOne = new MyThreadOne();
        MyThreadTwo threadTwo = new MyThreadTwo();
        MyThreadThree threadThree = new MyThreadThree();

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
