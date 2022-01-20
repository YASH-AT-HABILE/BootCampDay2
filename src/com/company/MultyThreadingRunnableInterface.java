package com.company;

class ThreadOne implements Runnable{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Bullet One is fired. ");
            executionCounter++;
        }
    }
}

class ThreadTwo implements Runnable{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Bullet Two is fired. ");
            executionCounter++;
        }
    }
}

class ThreadThree implements Runnable{
    public void run(){
        short limit = 1000;
        short executionCounter = 0;
        while(executionCounter < limit){
            System.out.println("Bullet Three is Fired. ");
            executionCounter++;
        }
    }
}

public class MultyThreadingRunnableInterface {
    public static void main(String[] args) {
        ThreadOne bulletOne = new ThreadOne();
        Thread gun1 = new Thread(bulletOne);
        ThreadTwo bulletTwo = new ThreadTwo();
        Thread gun2 = new Thread(bulletTwo);
        ThreadThree bulletThree = new ThreadThree();
        Thread gun3 = new Thread(bulletThree);

        gun1.start();
        gun2.start();
        gun3.start();
    }
}
